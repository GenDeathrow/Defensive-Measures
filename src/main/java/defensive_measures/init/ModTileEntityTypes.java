package defensive_measures.init;

import defensive_measures.DefensiveMeasures;
import defensive_measures.common.tiles.TurretTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTileEntityTypes {

	public static final RegistryObject<TileEntityType<TurretTileEntity>> TurrentType = DefensiveMeasures.TILE_ENTITY_TYPES.register("turretbase", () -> TileEntityType.Builder.create(TurretTileEntity::new, 
			ModBlocks.turret_tier_1.get()
			).build(null));

}
