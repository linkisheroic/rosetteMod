package com.natura.rosette;

import com.natura.rosette.item.RosetteItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropSeeds {
	
	
	public DropSeeds() {
		
		
		
	}

	@SubscribeEvent
	public void dropSeeds(BlockEvent.HarvestDropsEvent event) {
	
	if(event.getState().getBlock() == Blocks.TALLGRASS){
	event.setDropChance((float) 0.05);
	event.getDrops().add(new ItemStack(Items.WHEAT_SEEDS));
	event.getDrops().add(new ItemStack(RosetteItems.strawberrySeeds));
	event.getDrops().add(new ItemStack(RosetteItems.blueberrySeeds));
	}
	
}
}