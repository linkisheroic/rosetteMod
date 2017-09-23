package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCherry extends ItemFood {
	
	public ItemCherry(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("cherry");
		setRegistryName("cherry");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "cherry");
	}
	
	@Override
	public ItemCherry setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
