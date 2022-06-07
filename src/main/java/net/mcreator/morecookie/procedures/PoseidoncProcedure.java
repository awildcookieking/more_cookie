package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Comparator;

public class PoseidoncProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double loop = 0;
		double pa = 0;
		double xr = 0;
		double zr = 0;
		if (true == !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
			if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == sourceentity) {
				if (Math.random() <= 0.1) {
					for (int index0 = 0; index0 < (int) (200); index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ThrownTrident(EntityType.TRIDENT, _level);
							entityToSpawn.moveTo(x, (y + 3), z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement((Math.random() - Math.random()), (Math.random() - Math.random()),
									(Math.random() - Math.random()));
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 5;
					xr = 15;
					zr = 15;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon drowned ~ ~ ~ {HandItems:[{id:\"minecraft:trident\",Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					for (int index2 = 0; index2 < (int) (45); index2++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 40 - Math.random() * 40), (y + 30),
													(z + Math.random() * 40 - Math.random() * 40)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon drowned ~ ~ ~ {Passengers:[{id:\"minecraft:area_effect_cloud\",Particle:\"splash\",Radius:1f,RadiusPerTick:0f,RadiusOnUse:0f,Duration:600,Effects:[{Id:7b,Amplifier:1b,Duration:1,ShowParticles:0b}]}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]}");
					}
				}
				if (Math.random() <= 0.1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(
										CommandSource.NULL,
										new Vec3(
												(x + Math.random() * 20 - Math.random() * 20), (y + 1),
												(z + Math.random() * 20 - Math.random() * 20)),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon ravager ~ ~ ~ {Passengers:[{id:\"minecraft:drowned\",HandItems:[{id:\"minecraft:trident\",Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}]}");
				}
				if (Math.random() <= 0.1) {
					for (int index3 = 0; index3 < (int) (4); index3++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 40 - Math.random() * 40), (y + 5),
													(z + Math.random() * 40 - Math.random() * 40)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon ravager ~ ~ ~ {Passengers:[{id:\"minecraft:drowned\",HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:12b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}]}");
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 5;
					xr = 15;
					zr = 15;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), y,
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon guardian ~ ~ ~ {ActiveEffects:[{Id:1b,Amplifier:1b,Duration:199999980,ShowParticles:0b},{Id:8b,Amplifier:1b,Duration:199999980,ShowParticles:0b},{Id:28b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					for (int index5 = 0; index5 < (int) (300); index5++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ThrownTrident(EntityType.TRIDENT, _level);
							entityToSpawn.moveTo((x + Math.random() * 40 - Math.random() * 40), (y + 30),
									(z + Math.random() * 40 - Math.random() * 40), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
