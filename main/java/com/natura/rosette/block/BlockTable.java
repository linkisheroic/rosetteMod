package com.natura.rosette.block;

import com.natura.rosette.Rosette;
import com.natura.rosette.item.ItemColoredBlock;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class BlockTable extends BlockBase {
	
	public static final PropertyEnum<BlockPlanks.EnumType> TYPE = PropertyEnum.<BlockPlanks.EnumType>create("type", BlockPlanks.EnumType.class);
	
	public BlockTable() {
		super(Material.WOOD, "table");
		 this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, BlockPlanks.EnumType.OAK));
		this.setCreativeTab(Rosette.decorationTab);
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		Rosette.proxy.registerItemRenderer(itemBlock, this.getMetaFromState(this.blockState.getBaseState()), name);
	}
	
	@Override
	public int damageDropped(IBlockState state)
    {
        return ((BlockPlanks.EnumType)state.getValue(TYPE)).getMetadata();
    }
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (BlockPlanks.EnumType blockplanks$enumtype : BlockPlanks.EnumType.values())
        {
            items.add(new ItemStack(this, 1, blockplanks$enumtype.getMetadata()));
        }
    }
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockTable setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	 public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(TYPE, BlockPlanks.EnumType.byMetadata(meta & 7));
	    }

	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    public int getMetaFromState(IBlockState state)
	    {
	        int i = 0;
	        i = i | ((BlockPlanks.EnumType)state.getValue(TYPE)).getMetadata();
	        return i;
	    }
	    
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {TYPE});
	    }
	    @Override
	    public Item createItemBlock() {
	    	
	    	String[] typeNames = new String[6];
	    	typeNames[0] = "oak";
	    	typeNames[1] = "spruce";
	    	typeNames[2] = "birch";
	    	typeNames[3] = "jungle";
	    	typeNames[4] = "acacia";
	    	typeNames[5] = "dark_oak";
	    	
			return new ItemMultiTexture(this, null, typeNames);
				
		}



}
