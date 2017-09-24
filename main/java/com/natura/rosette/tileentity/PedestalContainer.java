package com.natura.rosette.tileentity;

import javax.annotation.Nullable;

import com.natura.rosette.item.RosetteItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class PedestalContainer extends Container {
	
	public PedestalContainer(InventoryPlayer playerInv, final PedestalEntity pedestal) {
		IItemHandler inv = pedestal.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.NORTH);
		addSlotToContainer(new SlotItemHandler(inv, 0, 40, 35) {
			@Override
			public void onSlotChanged() {
				if(this.isItemValid(this.getStack()) && PedestalContainer.this.getSlot(1).getHasStack() == true && PedestalContainer.this.getSlot(1).isItemValid(PedestalContainer.this.getSlot(1).getStack())) {
					if(this.getStack().getItem() == RosetteItems.ironRing) {
						if(PedestalContainer.this.getSlot(1).getStack().getItem() == RosetteItems.opal)
							inv.insertItem(2, new ItemStack(RosetteItems.opalIronRing), false);
						}
						if(this.getStack().getItem() == RosetteItems.goldRing) {
							if(PedestalContainer.this.getSlot(1).getStack().getItem() == RosetteItems.opal)
								inv.insertItem(2, new ItemStack(RosetteItems.opalIronRing), false);
						}
					}
				pedestal.markDirty();
			}
			
           
		});
		
		addSlotToContainer(new SlotItemHandler(inv, 1, 80, 35) {
			@Override
			public void onSlotChanged() {
				if(this.isItemValid(this.getStack()) && PedestalContainer.this.getSlot(0).getHasStack() == true && PedestalContainer.this.getSlot(0).isItemValid(PedestalContainer.this.getSlot(0).getStack())) {
					if(this.getStack().getItem() == RosetteItems.opal) {
						if(PedestalContainer.this.getSlot(0).getStack().getItem() == RosetteItems.ironRing)
							inv.insertItem(2, new ItemStack(RosetteItems.opalIronRing), false);
						}
						if(this.getStack().getItem() == RosetteItems.opal) {
							if(PedestalContainer.this.getSlot(0).getStack().getItem() == RosetteItems.goldRing)
								inv.insertItem(2, new ItemStack(RosetteItems.opalGoldRing), false);
						} 
					} 
				pedestal.markDirty();
			}
			
		});
		
		addSlotToContainer(new SlotItemHandler(inv, 2, 130, 35) {
			
			@Override
			public boolean isItemValid(ItemStack stack) {
				return false;
			}
			
			@Override
			public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
				PedestalContainer.this.getSlot(0).inventory.clear();
				PedestalContainer.this.getSlot(1).inventory.clear();
				pedestal.markDirty();
				return super.onTake(thePlayer, stack);
			}
			
		});
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
	
		for (int k = 0; k < 9; k++) {
			addSlotToContainer(new Slot(playerInv, k, 8 + k * 18, 142));
		}
	}
	
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int index) {
		ItemStack itemstack = null;
		Slot slot = inventorySlots.get(index);
	
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
	
			int containerSlots = inventorySlots.size() - player.inventory.mainInventory.size();
	
			if (index < containerSlots) {
				if (!this.mergeItemStack(itemstack1, containerSlots, inventorySlots.size(), true)) {
					return null;
				}
			} else if (!this.mergeItemStack(itemstack1, 0, containerSlots, false)) {
				return null;
			}
	
			if (itemstack1.getCount() == 0) {
				slot.putStack(null);
			} else {
				slot.onSlotChanged();
			}
	
			if (itemstack1.getCount() == itemstack.getCount()) {
				return null;
			}
	
			slot.onTake(player, itemstack1);
		}
	
		return itemstack;
	}
	
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}

}
