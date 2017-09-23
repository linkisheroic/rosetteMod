package com.natura.rosette;

import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropLeaves {
	
public DropLeaves() {
		
		
		
	}

	@SubscribeEvent
	public void dropLeaves(BlockEvent.HarvestDropsEvent event) {
	
	if(event.getState().getBlock() == Blocks.LEAVES) {
	event.setDropChance((float) 0.05);
	event.getDrops().add(new ItemStack(RosetteItems.acorn));
	event.getDrops().add(new ItemStack(Items.APPLE));
	}
	
}

}
