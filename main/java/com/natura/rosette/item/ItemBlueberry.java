package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBlueberry extends ItemFood {

	public ItemBlueberry(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("blueberry");
		setRegistryName("blueberry");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "blueberry");
	}
	
	@Override
	public ItemBlueberry setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
