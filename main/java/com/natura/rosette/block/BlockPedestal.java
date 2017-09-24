package com.natura.rosette.block;

import com.natura.rosette.Rosette;
import com.natura.rosette.proxy.GuiHandler;
import com.natura.rosette.tileentity.PedestalEntity;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPedestal extends Block implements ITileEntityProvider {
	
	public static final int GUI_ID = 1;

	public BlockPedestal() {
		super(Material.ROCK);
		this.setUnlocalizedName("pedestal");
		this.setRegistryName("pedestal");
		this.setCreativeTab(Rosette.decorationTab);
	}
	
	 @Override
	    public TileEntity createNewTileEntity(World worldIn, int meta) {
	        return new PedestalEntity();
	    }

	    @Override
	    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
	    		EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
	    	if (!worldIn.isRemote) {
				// ...
	 			if (playerIn.isSneaking()) {
	 				// ...
	  			} else {
	  				playerIn.openGui(Rosette.instance, GuiHandler.PEDESTAL, worldIn, pos.getX(), pos.getY(), pos.getZ());
	  			}
	  		}
	  		return true;
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
	public BlockPedestal setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}


	public void registerItemModel(Item itemBlock) {
		Rosette.proxy.registerItemRenderer(itemBlock, 0, "pedestal");
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this);
	}

}
