package com.natura.rosette.item;

import com.natura.rosette.Rosette;
import com.natura.rosette.block.BlockBlueberryBush;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
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

public class ItemAcorn extends Item {

	public static Block block;
	public ItemAcorn() {
		this.block = Blocks.SAPLING;
		setUnlocalizedName("acorn");
		setRegistryName("acorn");
	}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, "acorn");
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
		worldIn.setBlockState(pos, sapling.getDefaultState(), 2);
		worldIn.notifyNeighborsOfStateChange(pos, sapling, false);
	}
	
	@Override
	public ItemAcorn setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
