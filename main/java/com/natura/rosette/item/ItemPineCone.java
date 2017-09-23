package com.natura.rosette.item;

import java.util.Properties;

import com.natura.rosette.Rosette;

import io.netty.handler.codec.http.HttpHeaders.Values;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPineCone extends Item {
	
	public static Block block;
	public ItemPineCone() {
		this.block = Blocks.SAPLING;
		setUnlocalizedName("pine_cone");
		setRegistryName("pine_cone");
	}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "pine_cone");
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		ItemStack itemstack = player.getHeldItem(hand);
		
		if(this.block.canPlaceBlockAt(worldIn, pos.offset(EnumFacing.UP))) {	
			placeSapling(worldIn, pos.offset(EnumFacing.UP), this.block);
			itemstack.shrink(1);
			return EnumActionResult.SUCCESS;
			
		}
		
		else
			return EnumActionResult.FAIL;
		
	}
	
	public static void placeSapling(World worldIn, BlockPos pos, Block sapling) {
		worldIn.setBlockState(pos, sapling.getDefaultState().withProperty(BlockSapling.TYPE, BlockPlanks.EnumType.SPRUCE), 2);
		worldIn.notifyNeighborsOfStateChange(pos, sapling, false);
	}
	
	@Override
	public ItemPineCone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
