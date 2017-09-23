package com.natura.rosette.item;

import com.natura.rosette.Rosette;
import com.natura.rosette.block.RosetteBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class BlueberrySeeds extends ItemSeeds {
	
	public BlueberrySeeds() {
		super(RosetteBlocks.blueberryPlant, Blocks.FARMLAND);
		setUnlocalizedName("blueberry_seeds");
		setRegistryName("blueberry_seeds");
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(item, 0, "blueberry_seeds");
	}

	@Override
	public BlueberrySeeds setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
