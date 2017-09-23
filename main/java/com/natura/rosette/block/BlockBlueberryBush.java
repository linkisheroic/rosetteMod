package com.natura.rosette.block;

import java.util.Random;

import com.natura.rosette.Rosette;
import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBlueberryBush extends BlockBush {
	
	public BlockBlueberryBush() {
		super();
		setUnlocalizedName("blueberry_bush");
		setRegistryName("blueberry_bush");
		setSoundType(SoundType.PLANT);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void registerItemModel(Item itemBlock) {
		Rosette.proxy.registerItemRenderer(itemBlock, 0, "blueberry_bush");
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RosetteItems.blueberry;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 2 + random.nextInt(2 + fortune);
	}
	
	@Override
	public BlockBlueberryBush setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
