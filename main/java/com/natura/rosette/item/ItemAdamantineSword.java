package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemAdamantineSword extends ItemSword {
	
	protected ItemAdamantineSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName("adamantine_sword");
		setRegistryName("adamantine_sword");
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(this, 0, "adamantine_sword");
	}

	@Override
	public ItemAdamantineSword setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
