package defensive_measures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import defensive_measures.init.ModNetwork;
import defensive_measures.init.ModReference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("defensive")
public class DefensiveMeasures
{
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final SimpleChannel network = ModNetwork.getNetworkChannel();
        
	public static final ItemGroup TAB = (new ItemGroup(ModReference.ModID +".general") {
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack createIcon() {
	         return new ItemStack(Items.BLACK_BANNER);
	      }
	   }).setTabPath("tiny_progression_items");
    

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModReference.ModID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModReference.ModID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,	ModReference.ModID);
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,	ModReference.ModID);
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ModReference.ModID);
	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, ModReference.ModID);
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, ModReference.ModID);
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPEHANDLER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ModReference.ModID);


    public DefensiveMeasures() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	bus.addListener(this::setup);
    	bus.addListener(this::enqueueIMC);
    	bus.addListener(this::processIMC);
    	bus.addListener(this::doClientStuff);

		ITEMS.register(bus);
		BLOCKS.register(bus);
		FLUIDS.register(bus);
		TILE_ENTITY_TYPES.register(bus);
		CONTAINERS.register(bus);
		FEATURES.register(bus);
		SOUNDS.register(bus);
		RECIPEHANDLER.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	
    }

    
	@SuppressWarnings("unused")
	private void doClientStuff(final FMLClientSetupEvent event) {
    	RenderType solid = RenderType.getSolid();
    	RenderType cutout_mipped = RenderType.getCutoutMipped();
    	RenderType cutout = RenderType.getCutout();
    	RenderType translucent = RenderType.getTranslucent();
    	RenderType translucent_no_crumbling = RenderType.getTranslucentNoCrumbling();
    	
    }

    private void enqueueIMC(final InterModEnqueueEvent event)  {  }

    private void processIMC(final InterModProcessEvent event)  {  }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {  }

}
