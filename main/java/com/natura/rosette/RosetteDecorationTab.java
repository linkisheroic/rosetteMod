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

public class RosetteDecorationTab extends CreativeTabs {
	
	public RosetteDecorationTab(){
		super("rosetteDecorations");
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(RosetteBlocks.witchHat));
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}
