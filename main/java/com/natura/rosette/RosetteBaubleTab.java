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

public class RosetteBaubleTab extends CreativeTabs {
	
	public RosetteBaubleTab(){
		super("rosetteBaubles");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(RosetteItems.goldTiara);
	}
	
	@Override
	public void displayAllRelevantItems(NonNullList<ItemStack> items) {
		super.displayAllRelevantItems(items);
		List<Item> itemsInOrder = Arrays.asList(RosetteItems.goldRing, RosetteItems.goldTiara, RosetteItems.ironRing, RosetteItems.ironTiara, RosetteItems.opalIronRing, RosetteItems.opalGoldRing);
		Comparator<ItemStack> tabSorter;
		tabSorter = Ordering.explicit(itemsInOrder).onResultOf(ItemStack::getItem);
		items.sort(tabSorter);
	}

}
