package com.natura.rosette;

import java.util.Comparator;

import com.google.common.collect.Ordering;
import com.natura.rosette.block.RosetteBlocks;
import com.natura.rosette.item.RosetteItems;
import com.natura.rosette.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Rosette.MODID, name = Rosette.MODNAME, version = Rosette.VERSION, useMetadata = true)
public class Rosette {

    public static final String MODID = "rosette";
    public static final String MODNAME = "Rosette";
    public static final String VERSION = "0.0.1";
    public static final RosetteTab creativeTab = new RosetteTab();
    public static final RosetteDecorationTab decorationTab = new RosetteDecorationTab();
    public static final Item.ToolMaterial adamantine = EnumHelper.addToolMaterial("ADAMANTINE", 3, 3122, 10.0F, 5.0F, 10);
    public static final ItemArmor.ArmorMaterial adamantineArmor = EnumHelper.addArmorMaterial("adamantine", MODID + ":adamantine", 3122, new int[]{5, 8, 8, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2F);


    @SidedProxy(clientSide = "com.natura.rosette.proxy.ClientProxy", serverSide = "com.natura.rosette.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static Rosette instance;
    
    @Mod.EventBusSubscriber
	public static class RegistrationHandler {
    	
    	@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
    		RosetteItems.register(event.getRegistry());
    		RosetteBlocks.registerItemBlocks(event.getRegistry());
		}
    	
    	@SubscribeEvent
    	public static void registerItems(ModelRegistryEvent event) {
    		RosetteItems.registerModels();
    		RosetteBlocks.registerModels();
    	}
    	
    	@SubscribeEvent
    	public static void registerBlocks(RegistryEvent.Register<Block> event) {
    		RosetteBlocks.register(event.getRegistry());
    	}
	
	}

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
       
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    
}

