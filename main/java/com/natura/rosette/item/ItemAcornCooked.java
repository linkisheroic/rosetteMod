package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemAcornCooked extends ItemFood {
	
	public ItemAcornCooked(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName("acorn_cooked");
		setRegistryName("acorn_cooked");
		}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "acorn_cooked");
	}
	
	@Override
	public ItemAcornCooked setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
