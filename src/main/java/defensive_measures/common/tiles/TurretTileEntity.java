package defensive_measures.common.tiles;

import defensive_measures.init.ModTileEntityTypes;
import net.minecraft.tileentity.TileEntity;

/**
 * Idea about the tile entity for this is to store the logic vars 
 * for a turret. Possibly different tiers of turret bases. But the base TE
 * will store what it targets, who is white listed to not shoot at, And and 
 * other things I can think of. 
 * 
 * Idea is a turret can be picked up and replaced with a different turret. 
 * And the base can be upgraded for better turrets. Maybe the base can also handled if its 
 * automated or man-able. ???? not sure yet. 
 * 
 * 
 * @author GenDeathrow
 */
public class TurretTileEntity extends TileEntity{

	private int tier;
	
	public TurretTileEntity() {
		super(ModTileEntityTypes.TurrentType.get());
	}

	public TileEntity setTier(int tier) {
		this.tier = tier;
		return this;
	}

	public int getTier() {
		return tier;
	}

	
}
