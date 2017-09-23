package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBlackberry extends ItemFood {
	
	public ItemBlackberry(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("blackberry");
		setRegistryName("blackberry");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "blackberry");
	}
	
	@Override
	public ItemBlackberry setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
