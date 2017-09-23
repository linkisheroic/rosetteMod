package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemPear extends ItemFood {
	
	public ItemPear(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("pear");
		setRegistryName("pear");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "pear");
	}
	
	@Override
	public ItemPear setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
