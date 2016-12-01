package com.gendeathrow.dm.core.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gendeathrow.dm.core.DefensiveMeasures;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static void RegisterItems()
	{
		
	}
	
	private static void registerItem(Item item, String name)
	{
		item.setUnlocalizedName(DefensiveMeasures.MODID +"."+ name);
		GameRegistry.register(item.setRegistryName(name));
		ITEMS.add(item);
	}
	
}
