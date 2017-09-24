package com.natura.rosette;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;
import com.natura.rosette.block.RosetteBlocks;
import com.natura.rosette.item.RosetteItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class RosetteTab extends CreativeTabs {
	
	public RosetteTab(){
		super(Rosette.MODID);
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(RosetteItems.roseQuartz);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
	@Override
	public void displayAllRelevantItems(NonNullList<ItemStack> items) {
		super.displayAllRelevantItems(items);
		List<Item> itemsInOrder = Arrays.asList(RosetteItems.goldRing, RosetteItems.goldTiara, RosetteItems.ironRing, RosetteItems.ironTiara, Item.getItemFromBlock(RosetteBlocks.beeHive), RosetteItems.honeyBucket, RosetteItems.honeyComb, RosetteItems.glazedApple, RosetteItems.batFur, RosetteItems.batGuano, RosetteItems.strawberrySeeds, RosetteItems.strawberry, RosetteItems.blueberrySeeds, RosetteItems.blueberry, Item.getItemFromBlock(RosetteBlocks.blueberryBush), RosetteItems.pear, RosetteItems.orange, RosetteItems.bananna, RosetteItems.coconut, RosetteItems.cherry, RosetteItems.acorn, RosetteItems.acornCooked, RosetteItems.pineCone, Item.getItemFromBlock(RosetteBlocks.blackberryBush), RosetteItems.blackberry, Item.getItemFromBlock(RosetteBlocks.waxMushroom), RosetteItems.wax, Item.getItemFromBlock(RosetteBlocks.dandehue), Item.getItemFromBlock(RosetteBlocks.rubberLog), Item.getItemFromBlock(RosetteBlocks.rubberPlanks), RosetteItems.rubberBucket, RosetteItems.rubber, Item.getItemFromBlock(RosetteBlocks.roseQuartzOre), RosetteItems.roseQuartz, Item.getItemFromBlock(RosetteBlocks.roseQuartzBlock), Item.getItemFromBlock(RosetteBlocks.opalOre), RosetteItems.opal, RosetteItems.wineBottle, RosetteItems.obsidianShard, RosetteItems.adamantineIngot, RosetteItems.adamantineSword, RosetteItems.adamantinePickaxe, RosetteItems.adamantineAxe, RosetteItems.adamantineShovel, RosetteItems.adamantineHoe, RosetteItems.adamantineHelmet, RosetteItems.adamantineChestplate, RosetteItems.adamantineLeggings, RosetteItems.adamantineBoots);
		Comparator<ItemStack> tabSorter;
		tabSorter = Ordering.explicit(itemsInOrder).onResultOf(ItemStack::getItem);
		items.sort(tabSorter);
	}
	
	
}
