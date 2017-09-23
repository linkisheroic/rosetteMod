package com.natura.rosette.block;

import javax.annotation.Nullable;

import com.natura.rosette.Rosette;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSeaShell extends BlockBase {
	
public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockSeaShell() {
		super(Material.GLASS, "sea_shell");
		this.setCreativeTab(Rosette.decorationTab);
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockSeaShell setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
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
	
	@Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
	
	@Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
    }
	
	 @Override
	    public IBlockState getStateFromMeta(int meta) {
	        return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

}
