package net.mcreator.bossrush.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bossrush.entity.NewmeteorEntity;

import java.util.Random;

public class OrbinitegolemcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double loop = 0;
		double pa = 0;
		double xr = 0;
		double zr = 0;
		if (world instanceof ServerLevel _level)
			_level.setDayTime(18000);
		if (sourceentity instanceof Player) {
			if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 4, (false), (true)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 4, (false), (true)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 3, (false), (true)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 120, 4, (false), (true)));
				entity.setDeltaMovement(new Vec3(0, (-10), 0));
			}
			if (Math.random() <= 0.1) {
				loop = 0;
				pa = 30;
				xr = 10;
				zr = 10;
				while (loop < pa) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(
										CommandSource.NULL,
										new Vec3(
												(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 1),
												(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon phantom ~ ~ ~ {Passengers:[{id:\"minecraft:falling_block\",BlockState:{Name:\"bossrush:spacerock\"},Time:1}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}");
					loop = loop + 1;
				}
			}
			if (Math.random() <= 0.1) {
				loop = 0;
				pa = 10;
				xr = 10;
				zr = 10;
				while (loop < pa) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(
										CommandSource.NULL,
										new Vec3(
												(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 1),
												(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon vex ~ ~ ~ {Passengers:[{id:\"minecraft:falling_block\",BlockState:{Name:\"bossrush:spacerock\"},Time:-10000}]}");
					loop = loop + 1;
				}
			}
			if (Math.random() <= 0.1) {
				for (int index2 = 0; index2 < (int) (3000); index2++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3((x + Mth.nextDouble(new Random(), -40, 40)), (Mth.nextDouble(new Random(), 10, 500)),
												(z + Mth.nextDouble(new Random(), -40, 40))),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon falling_block ~ ~ ~ {BlockState:{Name:\"bossrush:spacerock\"},Time:1}");
				}
			}
			if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
					NewmeteorEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, 10, 5);
				}
			}
			if (Math.random() <= 0.1) {
				for (int index3 = 0; index3 < (int) (3); index3++) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(
										CommandSource.NULL,
										new Vec3((x + Mth.nextDouble(new Random(), -40, 40)), 0.1, (z + Mth.nextDouble(new Random(), -40,
												40))),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon area_effect_cloud ~ ~ ~ {Particle:\"ash\",Radius:0f,RadiusPerTick:0.1f,RadiusOnUse:0f,Duration:200,Potion:\"minecraft:strong_harming\"}");
				}
			}
		}
	}
}
