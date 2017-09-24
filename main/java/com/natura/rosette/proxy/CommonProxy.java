package com.natura.rosette.proxy;

import com.google.common.collect.Ordering;
import com.natura.rosette.DropLeaves;
import com.natura.rosette.DropSeeds;
import com.natura.rosette.RecipesSmelting;
import com.natura.rosette.Rosette;
import com.natura.rosette.RosetteTab;
import com.natura.rosette.item.ItemBase;
import com.natura.rosette.item.RosetteItems;
import com.natura.rosette.tileentity.PedestalEntity;
import com.natura.rosette.worldgen.WorldGenOre;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(new WorldGenOre(), 3);
    	GameRegistry.registerTileEntity(PedestalEntity.class, Rosette.MODID + "_pedestal");
    }

    public void init(FMLInitializationEvent e) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(Rosette.instance, new GuiHandler());
    	RecipesSmelting.init();
    	MinecraftForge.EVENT_BUS.register(new DropSeeds());
    	MinecraftForge.EVENT_BUS.register(new DropLeaves());
    }

    public void postInit(FMLPostInitializationEvent e) {
    	
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }
    
	public void registerItemRenderer(Item item, int i, String name) {
		// TODO Auto-generated method stub
		
	}
	
	

}