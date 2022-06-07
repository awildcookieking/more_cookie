package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MotcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (6 <= (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
				? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
				: 0)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == sourceentity)) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn
									.moveTo(Vec3.atBottomCenterOf(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));
							entityToSpawn.setVisualOnly(false);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FIREWORK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
									10, 1, 3, 3, 1);
					}
				}
			}
		}
		if (sourceentity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 65,
					(int) (2 + (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
							? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
							: 0)),
					(true), (true)));
	}
}
