package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.morecookie.init.MoreCookieModMobEffects;

public class SplashcodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double loop = 0;
		double pa = 0;
		double xr = 0;
		double zr = 0;
		double aaaaaa = 0;
		aaaaaa = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MoreCookieModMobEffects.SPLASHCOOLDOWN.get()) : false) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MoreCookieModMobEffects.SPLASHCOOLDOWN.get(), 120, 1, (false), (false)));
			for (int index0 = 0; index0 < (int) (20); index0++) {
				loop = 0;
				pa = 6;
				xr = aaaaaa + 3;
				zr = aaaaaa + 3;
				while (loop < pa) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(
										CommandSource.NULL,
										new Vec3(
												(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 0.5),
												(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon area_effect_cloud ~ ~ ~ {Particle:\"splash\",Radius:0.5f,RadiusPerTick:0f,RadiusOnUse:0f,Duration:60,Effects:[{Id:20b,Amplifier:9b,Duration:400,ShowParticles:0b}]}");
					loop = loop + 1;
				}
				aaaaaa = aaaaaa + 1;
			}
		}
	}
}
