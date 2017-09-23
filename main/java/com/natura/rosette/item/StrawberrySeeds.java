package com.natura.rosette.item;

import com.natura.rosette.Rosette;
import com.natura.rosette.block.RosetteBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class StrawberrySeeds extends ItemSeeds {
	
	public StrawberrySeeds() {
		super(RosetteBlocks.strawberryPlant, Blocks.FARMLAND);
		setUnlocalizedName("strawberry_seeds");
		setRegistryName("strawberry_seeds");
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(item, 0, "strawberry_seeds");
	}
	
	@Override
	public StrawberrySeeds setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
