package defensive_measures.common.blocks;

import javax.annotation.Nullable;

import defensive_measures.common.tiles.TurretTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class TurretBase extends Block{

	private final int tier;
	
	public TurretBase(Properties properties, int tierIn) {
		super(properties);
		this.tier = tierIn;
	}

	@Override
	public boolean hasTileEntity(BlockState state){
		return true;
	}
	
	@Nullable
	@Override
	public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
		return new TurretTileEntity().setTier(tier);
	}
}
