package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.morecookie.init.MoreCookieModEntities;
import net.mcreator.morecookie.entity.CerberusEntity;

import java.util.Comparator;

public class HadesattackcProcedure {
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
									"/summon illusioner ~ ~ ~ {Glowing:1b,ActiveEffects:[{Id:14b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					if (false == !world.getEntitiesOfClass(CerberusEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true)
							.isEmpty()) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new CerberusEntity(MoreCookieModEntities.CERBERUS.get(), _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 70;
					xr = 20;
					zr = 20;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 0.5),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon area_effect_cloud ~ ~ ~ {Particle:\"soul\",CustomNameVisible:1b,Radius:1.5f,RadiusPerTick:0f,RadiusOnUse:0f,Duration:200,Effects:[{Id:20b,Amplifier:5b,Duration:200,ShowParticles:0b}],CustomName:'{\"text\":\"SOUL WALL\",\"color\":\"dark_blue\",\"bold\":true}'}");
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
													(x + Math.random() * 40 - Math.random() * 40), (y + 50),
													(z + Math.random() * 40 - Math.random() * 40)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon husk ~ ~ ~ {Glowing:1b,ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b},{Id:28b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index3 = 0; index3 < (int) (45); index3++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((x + Math.random() * 40 - Math.random() * 40), (y + 30),
													(z + Math.random() * 40 - Math.random() * 40)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon wither_skull ~ ~ ~ {Glowing:1b,power:[0.0,0.1,0.0]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index4 = 0; index4 < (int) (1); index4++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 40 - Math.random() * 40), (y + 30),
													(z + Math.random() * 40 - Math.random() * 40)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon phantom ~ ~ ~ {Size:8,CustomName:'{\"text\":\"DARK DRAGON\",\"color\":\"black\",\"bold\":true}',ActiveEffects:[{Id:5b,Amplifier:1b,Duration:19999980,ShowParticles:0b},{Id:11b,Amplifier:2b,Duration:19999980,ShowParticles:0b},{Id:12b,Amplifier:4b,Duration:19999980,ShowParticles:0b}]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index5 = 0; index5 < (int) (100); index5++) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level,
									new BlockPos(x + Math.random() * 40 - Math.random() * 40, y + 30, z + Math.random() * 40 - Math.random() * 40),
									Blocks.BLACK_CONCRETE.defaultBlockState());
					}
				}
				if (Math.random() <= 0.1) {
					for (int index6 = 0; index6 < (int) (1); index6++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 40 - Math.random() * 40), (y + 30),
													(z + Math.random() * 40 - Math.random() * 40)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon snowball ~ ~ ~ {Motion:[0.0,-5.0,0.0],Passengers:[{id:\"minecraft:witch\"},{id:\"minecraft:witch\"},{id:\"minecraft:witch\"},{id:\"minecraft:witch\"},{id:\"minecraft:witch\"}],Item:{id:\"minecraft:tnt\",Count:1b,tag:{Enchantments:[{}]}}}");
					}
				}
			}
		}
	}
}
