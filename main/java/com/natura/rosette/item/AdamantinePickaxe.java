package com.natura.rosette.item;

import com.natura.rosette.Rosette;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class AdamantinePickaxe extends ItemPickaxe {

	protected AdamantinePickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName("adamantine_pickaxe");
		setRegistryName("adamantine_pickaxe");
	}
	
	public void registerItemModel(Item item) {
		Rosette.proxy.registerItemRenderer(this, 0, "adamantine_pickaxe");
	}

	@Override
	public AdamantinePickaxe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
