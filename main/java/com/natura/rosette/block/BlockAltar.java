package com.natura.rosette.block;

import com.natura.rosette.Rosette;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAltar extends BlockBase {
	
	public BlockAltar() {
		super(Material.ROCK, "altar");
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
	public BlockAltar setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
