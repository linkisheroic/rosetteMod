package com.natura.rosette.block;

import java.util.Random;

import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockHive extends BlockBase {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockHive(String name) {
		super(Material.WOOD, name);
		setHardness(0.4f);
		setResistance(0.2f);
		setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RosetteItems.honeyComb;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1 + random.nextInt(2);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
		if(playerIn.getHeldEquipment() != null) {
		if(playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
			playerIn.inventory.clearMatchingItems(Items.BUCKET, -1, 1, null);
			playerIn.addItemStackToInventory(new ItemStack(RosetteItems.honeyBucket, 1, 0));
		}
		}
		}
		return true;
	}

	@Override
	 public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack) {
	     EnumFacing entityFacing = entity.getHorizontalFacing();

	     if(!world.isRemote) {
	         if(entityFacing == EnumFacing.NORTH) {
	             entityFacing = EnumFacing.NORTH;
	         } else if(entityFacing == EnumFacing.EAST) {
	             entityFacing = EnumFacing.EAST;
	         } else if(entityFacing == EnumFacing.SOUTH) {
	             entityFacing = EnumFacing.SOUTH;
	         } else if(entityFacing == EnumFacing.WEST) {
	             entityFacing = EnumFacing.WEST;
	         }

	         world.setBlockState(pos, state.withProperty(FACING, entityFacing), 2);
	     }
	 }
	
	@Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
    }


 @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
}
 
	@Override
	public boolean canDropFromExplosion(Explosion explosionIn) {
		return false;
	}

	@Override
	public BlockHive setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
