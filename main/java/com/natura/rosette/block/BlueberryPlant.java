package com.natura.rosette.block;

import java.util.Random;

import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlueberryPlant extends BlockCrops {
	
	public BlueberryPlant() {
		setUnlocalizedName("blueberry_plant");
		setRegistryName("blueberry_plant");
		setSoundType(SoundType.PLANT);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if(this.getAge(state) != 7) {
			return RosetteItems.blueberrySeeds;
		}
		else {
		return RosetteItems.blueberry;
		}
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		if(this.getAge(state) != 7) {
			return 1;
		}
		else {
			return random.nextInt(5) + 1;
		}
		
	}
	
	@Override
	protected Item getSeed() {
		return RosetteItems.blueberrySeeds;
	}
	
	@Override
	protected Item getCrop() {
		return RosetteItems.blueberry;
	}
}
