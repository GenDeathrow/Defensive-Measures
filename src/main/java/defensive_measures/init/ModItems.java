package defensive_measures.init;

import java.util.function.Supplier;

import defensive_measures.DefensiveMeasures;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

	

	
	
	
	
	
	
	/**
	 * Item Registry Helper
	 * 
	 * @param name
	 * @param sup
	 * @return
	 */
    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<? extends T> sup) {
        return DefensiveMeasures.ITEMS.register(name, sup);
    }
}
