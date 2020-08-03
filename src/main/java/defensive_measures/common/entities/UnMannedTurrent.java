package defensive_measures.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public class UnMannedTurrent extends AbstractTurrent{

	public UnMannedTurrent(EntityType<? extends LivingEntity> entityTypeIn, World worldIn) {
		super(entityTypeIn, worldIn);
	}
}
