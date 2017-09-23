package com.natura.rosette.block;

import java.util.List;
import java.util.Random;

import com.natura.rosette.item.RosetteItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class StrawberryPlant extends BlockCrops {
	
	public StrawberryPlant() {
		setUnlocalizedName("strawberry_plant");
		setRegistryName("strawberry_plant");
		setSoundType(SoundType.PLANT);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if(this.getAge(state) != 7) {
			return RosetteItems.strawberrySeeds;
		}
		else {
		return RosetteItems.strawberry;
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
		return RosetteItems.strawberrySeeds;
	}
	
	@Override
	protected Item getCrop() {
		return RosetteItems.strawberry;
	}

}
