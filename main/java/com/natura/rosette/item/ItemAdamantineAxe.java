package com.natura.rosette.item;

import java.util.Set;

import com.google.common.collect.Sets;
import com.natura.rosette.Rosette;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class ItemAdamantineAxe extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	
	protected ItemAdamantineAxe(ToolMaterial material) {
		super(material, EFFECTIVE_ON);
		setUnlocalizedName("adamantine_axe");
		setRegistryName("adamantine_axe");
	}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "adamantine_axe");
	}

	@Override
	public ItemAdamantineAxe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
