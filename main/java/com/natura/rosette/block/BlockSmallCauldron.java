package com.natura.rosette.block;

import com.natura.rosette.Rosette;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSmallCauldron extends BlockBase {
	public BlockSmallCauldron() {
		super(Material.IRON, "small_cauldron");
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
	public BlockSmallCauldron setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
