package com.natura.rosette;

import com.natura.rosette.block.RosetteBlocks;
import com.natura.rosette.item.RosetteItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesSmelting {
	
	public static void init() {
		GameRegistry.addSmelting(RosetteBlocks.opalOre, new ItemStack(RosetteItems.opal), 0.7f);
		GameRegistry.addSmelting(RosetteBlocks.roseQuartzOre, new ItemStack(RosetteItems.roseQuartz), 0.7f);
		GameRegistry.addSmelting(RosetteItems.acorn, new ItemStack(RosetteItems.acornCooked), 0.4F);
		GameRegistry.addSmelting(RosetteBlocks.rubberLog, new ItemStack(Items.COAL, 1, 1), 0.4F);
	}

}
