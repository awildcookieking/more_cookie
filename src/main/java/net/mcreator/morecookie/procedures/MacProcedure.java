package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.morecookie.init.MoreCookieModMobEffects;

public class MacProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MoreCookieModMobEffects.AXECOOLDOWN.get()) : false)) {
			xx = x;
			yy = y;
			zz = z;
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x() * 15), (entity.getDeltaMovement().y() * 5), (entity.getDeltaMovement().z() * 15)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MoreCookieModMobEffects.AXECOOLDOWN.get(), 80, 1, (false), (false)));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (xx - entity.getDeltaMovement().x() * 9), (yy - entity.getDeltaMovement().y() * 3),
						(zz - entity.getDeltaMovement().z() * 9), 5, Explosion.BlockInteraction.NONE);
		}
	}
}
