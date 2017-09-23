package com.natura.rosette.block;

import com.natura.rosette.Rosette;
import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class RosetteBlocks {
	public static BlockBase roseQuartzBlock = new BlockBase(Material.ROCK ,"rose_quartz_block").setCreativeTab(Rosette.creativeTab);
	public static BlockHive beeHive = new BlockHive("bee_hive").setCreativeTab(Rosette.creativeTab);
	public static StrawberryPlant strawberryPlant = new StrawberryPlant();
	public static RoseQuartzOre roseQuartzOre = new RoseQuartzOre(Material.ROCK, "rose_quartz_ore").setCreativeTab(Rosette.creativeTab);
	public static BlockBushBase waxMushroom = new BlockBushBase("wax_mushroom").setCreativeTab(Rosette.creativeTab);
	public static BlueberryPlant blueberryPlant = new BlueberryPlant();
	public static BlockOpalOre opalOre = new BlockOpalOre(Material.ROCK, "opal_ore").setCreativeTab(Rosette.creativeTab);
	public static BlockBase rubberLog = new BlockBase(Material.WOOD, "rubber_log").setCreativeTab(Rosette.creativeTab);
	public static BlockBase rubberPlanks = new BlockBase(Material.WOOD, "rubber_planks").setCreativeTab(Rosette.creativeTab);
	public static BlockFlowerBase dandehue = new BlockFlowerBase("dandehue").setCreativeTab(Rosette.creativeTab);
	public static BlockBlueberryBush blueberryBush = new BlockBlueberryBush().setCreativeTab(Rosette.creativeTab);
	public static BlockBlackberryBush blackberryBush = new BlockBlackberryBush().setCreativeTab(Rosette.creativeTab);
	
	
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				roseQuartzBlock,
				beeHive,
				strawberryPlant,
				roseQuartzOre,
				waxMushroom,
				blueberryPlant,
				opalOre,
				rubberLog,
				rubberPlanks,
				dandehue,
				blueberryBush,
				blackberryBush
		);

	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				roseQuartzBlock.createItemBlock().setRegistryName(roseQuartzBlock.getRegistryName()),
				beeHive.createItemBlock().setRegistryName(beeHive.getRegistryName()),
				roseQuartzOre.createItemBlock().setRegistryName(roseQuartzOre.getRegistryName()),
				waxMushroom.createItemBlock().setRegistryName(waxMushroom.getRegistryName()),
				opalOre.createItemBlock().setRegistryName(opalOre.getRegistryName()),
				rubberLog.createItemBlock().setRegistryName(rubberLog.getRegistryName()),
				rubberPlanks.createItemBlock().setRegistryName(rubberPlanks.getRegistryName()),
				dandehue.createItemBlock().setRegistryName(dandehue.getRegistryName()),
				blueberryBush.createItemBlock().setRegistryName(blueberryBush.getRegistryName()),
				blackberryBush.createItemBlock().setRegistryName(blackberryBush.getRegistryName())
		);
	}

	public static void registerModels() {
		roseQuartzBlock.registerItemModel(Item.getItemFromBlock(roseQuartzBlock));
		beeHive.registerItemModel(Item.getItemFromBlock(beeHive));
		roseQuartzOre.registerItemModel(Item.getItemFromBlock(roseQuartzOre));
		waxMushroom.registerItemModel(Item.getItemFromBlock(waxMushroom));
		opalOre.registerItemModel(Item.getItemFromBlock(opalOre));
		rubberLog.registerItemModel(Item.getItemFromBlock(rubberLog));
		rubberPlanks.registerItemModel(Item.getItemFromBlock(rubberPlanks));
		dandehue.registerItemModel(Item.getItemFromBlock(dandehue));
		blueberryBush.registerItemModel(Item.getItemFromBlock(blueberryBush));
		blackberryBush.registerItemModel(Item.getItemFromBlock(blackberryBush));
	}

}
