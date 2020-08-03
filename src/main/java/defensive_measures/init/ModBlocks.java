package defensive_measures.init;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

import defensive_measures.DefensiveMeasures;
import defensive_measures.common.blocks.TurretBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidAttributes.Builder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

	public static RegistryObject<Block> turret_tier_1 = register("turret_tier_1", () -> new TurretBase(Block.Properties.create(Material.IRON), 1), DefensiveMeasures.TAB);
	
	
	
	//Block Helper Functions
    
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup)
    {
        return register(name, sup, ModBlocks::itemDefault);
    }

//    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
//        return register(name, sup, block -> item(block, renderMethod));
//    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, ItemGroup tab) {
        return register(name, sup, block -> item(block, tab));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        DefensiveMeasures.ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {

        return DefensiveMeasures.BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, DefensiveMeasures.TAB);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(DefensiveMeasures.TAB).setISTER(renderMethod));
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final ItemGroup itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup));
    }

	public static Builder fluidBuilderAttributes(int fluidColor, int density, int viscosity, int temperature, int luminosity) {
		FluidAttributes.Builder fluidBuilder = FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"));
		fluidBuilder.color(fluidColor);
		fluidBuilder.density(density);
		fluidBuilder.viscosity(viscosity);
		fluidBuilder.temperature(temperature);
		fluidBuilder.luminosity(luminosity);
		return fluidBuilder;
	}
	
	
}
