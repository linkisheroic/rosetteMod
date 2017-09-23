package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemAdamantineHoe extends ItemHoe {
	
	protected ItemAdamantineHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("adamantine_hoe");
		setRegistryName("adamantine_hoe");
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(this, 0, "adamantine_hoe");
	}

	@Override
	public ItemAdamantineHoe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
