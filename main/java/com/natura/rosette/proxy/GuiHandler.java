package com.natura.rosette.proxy;

import com.natura.rosette.tileentity.PedestalContainer;
import com.natura.rosette.tileentity.PedestalEntity;
import com.natura.rosette.tileentity.PedestalGui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	public static final int PEDESTAL = 0;
	
	@Override
	public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case PEDESTAL:
				return new PedestalContainer(player.inventory, (PedestalEntity)world.getTileEntity(new BlockPos(x, y, z)));
			default:
				return null;
		}
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case PEDESTAL:
				return new PedestalGui(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
			default:
				return null;
		}
	}
}
