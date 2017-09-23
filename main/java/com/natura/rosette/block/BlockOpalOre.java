package com.natura.rosette.block;

import java.util.Random;

import com.natura.rosette.Rosette;
import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockOpalOre extends Block {
	
	protected String name;

	public BlockOpalOre(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3f);
		setResistance(5f);
	}
	
	public void registerItemModel(Item itemBlock) {
		Rosette.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RosetteItems.opal;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1 + random.nextInt(2 + fortune);
	}
	
	@Override
	public BlockOpalOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
