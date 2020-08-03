package defensive_measures.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public class MannedTurrent extends AbstractTurrent{

	public MannedTurrent(EntityType<? extends LivingEntity> entityTypeIn, World worldIn) {
		super(entityTypeIn, worldIn);
	}
}
