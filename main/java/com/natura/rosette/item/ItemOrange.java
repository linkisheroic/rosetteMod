package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemOrange extends ItemFood {

	public ItemOrange(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("orange");
		setRegistryName("orange");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "orange");
	}
	
	@Override
	public ItemOrange setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
