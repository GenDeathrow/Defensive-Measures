package com.gendeathrow.dm.core;

import java.io.IOException;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

import com.gendeathrow.dm.core.proxies.CommonProxy;

@Mod(modid = DefensiveMeasures.MODID, name=DefensiveMeasures.NAME, version = DefensiveMeasures.VERSION)
public class DefensiveMeasures {

		public static final String MODID = "defensive";
	    public static final String VERSION = "0.0.1";
	    public static final String NAME = "Defensive Measures";
	    public static final String PROXY = "com.gendeathrow.dm.core.proxies";
	    public static final String CHANNELNAME = "vadgendm";
	    
	    @Instance(MODID)
		public static DefensiveMeasures instance;
	    
		@SidedProxy(clientSide = PROXY + ".ClientProxy", serverSide = PROXY + ".CommonProxy")
		public static CommonProxy proxy;

		public static SimpleNetworkWrapper network;
		
	    public static org.apache.logging.log4j.Logger logger;
	    
	    public static CreativeTabs defensiveTabs = new CreativeTabs(MODID)
	    {
	        @Override public Item getTabIconItem() 
	        {
	            return Items.BANNER;
	        }
	 
	    };
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	    	logger = event.getModLog();

	    	proxy.preInit(event);
	    }
		
	    @EventHandler
	    public void init(FMLInitializationEvent event) throws IOException
	    {
	    	proxy.init(event);
	    	
	    	// waila integration
//	        FMLInterModComms.sendMessage("Waila", "register", "com.gendeathrow.hatchery.core.waila.HatcheryTileProvider.load");
	    	
	    	proxy.registerEventHandlers();
	    	proxy.initRenderers();
	     }
	    
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	    	proxy.postInit(event);
	    	
	    }
	    
		@EventHandler
		public void serverStart(FMLServerStartingEvent event)
		{

		}
	}