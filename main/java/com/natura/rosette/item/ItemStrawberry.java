package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemStrawberry extends ItemFood {

	public ItemStrawberry(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("strawberry");
		setRegistryName("strawberry");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "strawberry");
	}
	
	@Override
	public ItemStrawberry setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	

}
