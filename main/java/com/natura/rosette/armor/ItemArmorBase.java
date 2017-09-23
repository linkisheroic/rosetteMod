package com.natura.rosette.armor;

import com.natura.rosette.Rosette;
import com.natura.rosette.block.BlockCandle;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemArmorBase extends ItemArmor {
	
	private String name;

	public ItemArmorBase(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		this.setCreativeTab(Rosette.creativeTab);
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemArmorBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
