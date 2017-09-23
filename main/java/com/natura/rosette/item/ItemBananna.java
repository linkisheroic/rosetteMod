package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBananna extends ItemFood {

	public ItemBananna(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("bananna");
		setRegistryName("bananna");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "bananna");
	}
	
	@Override
	public ItemBananna setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
