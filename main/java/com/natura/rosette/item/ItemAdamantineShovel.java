package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemAdamantineShovel extends ItemSpade {
	
	protected ItemAdamantineShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName("adamantine_shovel");
		setRegistryName("adamantine_shovel");
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(this, 0, "adamantine_shovel");
	}

	@Override
	public ItemAdamantineShovel setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
