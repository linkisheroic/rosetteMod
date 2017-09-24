package com.natura.rosette.item;

import java.util.ArrayList;
import java.util.List;

import com.natura.rosette.Rosette;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import baubles.api.cap.IBaublesItemHandler;
import baubles.api.render.IRenderBauble;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.actors.threadpool.Arrays;

public class ItemRing extends Item implements IBauble {

	protected String name;
	protected EnumRarity rarity;
	protected int type;
	protected AttributeModifier ironBoost = new AttributeModifier("ironAttackBoost", 1, 1);
	protected AttributeModifier goldBoost = new AttributeModifier("goldAttackBoost", 0.5, 1);
	
	public ItemRing(String name, EnumRarity rarity, int type)
	{
		super();
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setCreativeTab(Rosette.baubleTab);
		this.name = name;
		this.rarity = rarity;
		this.type = type;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public void registerItemModel() {
		Rosette.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if(!world.isRemote) { 
			IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
			for(int i = 0; i < baubles.getSlots(); i++) 
				if((baubles.getStackInSlot(i) == null || baubles.getStackInSlot(i).isEmpty()) && baubles.isItemValidForSlot(i, player.getHeldItem(hand), player)) {
					baubles.setStackInSlot(i, player.getHeldItem(hand).copy());
					if(!player.capabilities.isCreativeMode){
						player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY);
					}
					onEquipped(player.getHeldItem(hand), player);
					break;
				}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack) {
		return false;
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return this.rarity;
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return super.getUnlocalizedName();
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 1.9f);
		switch (type) {
		case 0: player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).applyModifier(ironBoost);
		case 1: player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).applyModifier(goldBoost);
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 2f);
		switch (type) {
		case 0: player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).removeModifier(ironBoost);
		case 1: player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).removeModifier(goldBoost);
		}
	}


}
