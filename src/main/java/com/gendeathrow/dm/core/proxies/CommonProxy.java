package com.gendeathrow.dm.core.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public boolean isClient()
	{
		return false;
	}
	
	public boolean isOpenToLAN()
	{
		return false;
	}
	
	public void registerTickHandlers() 
	{
	
	}
	
	
	public void initRenderers()
	{
		
	}
	
	public void registerEventHandlers()
	{

	}
	
	public void preInit(FMLPreInitializationEvent event)
	{
//		ModBlocks.preInit(event);
//		ModItems.RegisterItems();
//		ModFluids.registerFluids();		
	}
	
	public void init(FMLInitializationEvent event)
	{



	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
//		ModRecipes.RegisterOreDic();
//		ModRecipes.RegisterRecipes();
	}
	

}
