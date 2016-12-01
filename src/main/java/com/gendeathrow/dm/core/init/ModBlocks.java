package com.gendeathrow.dm.core.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gendeathrow.dm.core.DefensiveMeasures;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	
	
	public static void RegisterBlocks() 
	{
		
	}
	
	private static void registerItem(Item item, String name)
	{
		GameRegistry.register(item.setRegistryName(new ResourceLocation(DefensiveMeasures.MODID, name)));
	}

	private static void registerBlock(Block block, String name)
	{
		registerBlock(block, new ItemBlock(block), name);
	}

	private static void registerBlock(Block block, ItemBlock item, String name)
	{
		block.setUnlocalizedName(DefensiveMeasures.MODID +"."+ name);
		GameRegistry.register(block.setRegistryName(new ResourceLocation(DefensiveMeasures.MODID, name)));
		registerItem(item, name);
		BLOCKS.add(block);
	}
}
