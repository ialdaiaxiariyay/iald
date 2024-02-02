package net.ialdaiaxiariyay.iald.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.ialdaiaxiariyay.iald.IaldMod;

import java.util.Map;

public class KillswpProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				IaldMod.LOGGER.warn("Failed to load dependency entity for procedure Killswp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) - Double.POSITIVE_INFINITY));
		entity.attackEntityFrom(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1));
	}
}
