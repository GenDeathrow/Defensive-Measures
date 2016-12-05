package com.gendeathrow.dm.core.proxies;

import com.gendeathrow.dm.core.init.ModBlocks;
import com.gendeathrow.dm.core.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerItemAndBlockRenderers() {
		ModItems.registerRenderers();
		ModBlocks.registerRenderers();
	}

	@Override
	public void setCustomStateMap(Block block, StateMap stateMap) {
		ModelLoader.setCustomStateMapper(block, stateMap);
	}
	
	@Override
	public void postInit() {
		// Bind TE Render models here
	}
}
