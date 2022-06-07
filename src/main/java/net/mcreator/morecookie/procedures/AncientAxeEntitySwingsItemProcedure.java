package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.morecookie.init.MoreCookieModMobEffects;

public class AncientAxeEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MoreCookieModMobEffects.AXECOOLDOWN.get()) : false)) {
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x() * 5), (entity.getDeltaMovement().y() * 5), (entity.getDeltaMovement().z() * 5)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MoreCookieModMobEffects.AXECOOLDOWN.get(), 120, 1, (false), (false)));
		}
	}
}
