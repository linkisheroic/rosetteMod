package com.natura.rosette.item;

import com.natura.rosette.Rosette;
import com.natura.rosette.block.RosetteBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class RosetteItems {
	
	//Instantiate items used by the mod.
	public static ItemBase adamantineIngot = new ItemBase("adamantine_ingot").setCreativeTab(Rosette.creativeTab);
	public static ItemBase honeyBucket = (ItemBase) new ItemBase("bucket_honey").setContainerItem(Items.BUCKET).setCreativeTab(Rosette.creativeTab);
	public static ItemBase roseQuartz = new ItemBase("rose_quartz").setCreativeTab(Rosette.creativeTab);
	public static StrawberrySeeds strawberrySeeds = new StrawberrySeeds().setCreativeTab(Rosette.creativeTab);
	public static ItemStrawberry strawberry = new ItemStrawberry(2, 0.2F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemBase rubberBucket = (ItemBase) new ItemBase("bucket_rubber").setContainerItem(Items.BUCKET).setCreativeTab(Rosette.creativeTab);
	public static ItemBase rubber = new ItemBase("rubber").setCreativeTab(Rosette.creativeTab);
	public static ItemBase obsidianShard = new ItemBase("obsidian_shard").setCreativeTab(Rosette.creativeTab);
	public static ItemBase honeyComb = new ItemBase("honey_comb").setCreativeTab(Rosette.creativeTab);
	public static ItemBase wax = new ItemBase("wax").setCreativeTab(Rosette.creativeTab);
	public static BlueberrySeeds blueberrySeeds = new BlueberrySeeds().setCreativeTab(Rosette.creativeTab);
	public static ItemBlueberry blueberry = new ItemBlueberry(2, 0.2F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemGlazedApple glazedApple = new ItemGlazedApple(8, 0.6F, false).setCreativeTab(Rosette.creativeTab);
	public static AdamantinePickaxe adamantinePickaxe = new AdamantinePickaxe(Rosette.adamantine).setCreativeTab(Rosette.creativeTab);
	public static ItemBase opal = new ItemBase("opal").setCreativeTab(Rosette.creativeTab);
	public static ItemPear pear = new ItemPear(4, 0.4F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemOrange orange = new ItemOrange(4, 0.4F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemBananna bananna = new ItemBananna(6, 0.4F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemBlackberry blackberry = new ItemBlackberry(2, 0.2F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemBase coconut = new ItemBase("coconut").setCreativeTab(Rosette.creativeTab);
	public static ItemBase wineBottle = new ItemBase("wine_bottle").setCreativeTab(Rosette.creativeTab);
	public static ItemCherry cherry = new ItemCherry(3, 0.2F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemAcorn acorn = new ItemAcorn().setCreativeTab(Rosette.creativeTab);
	public static ItemAcornCooked acornCooked = new ItemAcornCooked(4, 0.2F, false).setCreativeTab(Rosette.creativeTab);
	public static ItemPineCone pineCone = new ItemPineCone().setCreativeTab(Rosette.creativeTab);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				adamantineIngot,
				honeyBucket,
				roseQuartz,
				strawberrySeeds,
				strawberry,
				rubberBucket,
				rubber,
				obsidianShard,
				honeyComb,
				wax,
				blueberrySeeds,
				blueberry,
				glazedApple,
				adamantinePickaxe,
				opal,
				pear,
				orange,
				bananna,
				blackberry,
				coconut,
				wineBottle,
				cherry,
				acorn,
				acornCooked,
				pineCone
		);
	}
	
	public static void registerModels() {
		adamantineIngot.registerItemModel();
		honeyBucket.registerItemModel();
		roseQuartz.registerItemModel();
		strawberrySeeds.registerItemModel(strawberrySeeds);
		strawberry.registerItemModel();
		rubberBucket.registerItemModel();
		rubber.registerItemModel();
		obsidianShard.registerItemModel();
		honeyComb.registerItemModel();
		wax.registerItemModel();
		blueberrySeeds.registerItemModel(blueberrySeeds);
		blueberry.registerItemModel();
		glazedApple.registerItemModel();
		adamantinePickaxe.registerItemModel(adamantinePickaxe);
		opal.registerItemModel();
		pear.registerItemModel();
		orange.registerItemModel();
		bananna.registerItemModel();
		blackberry.registerItemModel();
		coconut.registerItemModel();
		wineBottle.registerItemModel();
		cherry.registerItemModel();
		acorn.registerItemModel();
		acornCooked.registerItemModel();
		pineCone.registerItemModel();
	}

}
