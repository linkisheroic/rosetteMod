package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemGlazedApple extends ItemFood {
	
	public ItemGlazedApple(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("glazed_apple");
		setRegistryName("glazed_apple");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "glazed_apple");
	}
	
	@Override
	public ItemGlazedApple setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
