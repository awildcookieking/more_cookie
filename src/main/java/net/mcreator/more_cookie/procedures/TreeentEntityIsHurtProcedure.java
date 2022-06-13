package net.mcreator.bossrush.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Random;

public class TreeentEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double loop = 0;
		double pa = 0;
		double xr = 0;
		double zr = 0;
		if (sourceentity instanceof Player) {
			if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 1, (false), (true)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 1, (false), (true)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 1, (false), (true)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 120, 1, (false), (true)));
			}
			if (Math.random() <= 0.1) {
				loop = 0;
				pa = 15;
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
								"/summon husk ~ ~ ~ {HasVisualFire:0b,CustomNameVisible:1b,IsBaby:1b,CustomName:'[{\"text\":\"Mini\",\"color\":\"dark_green\",\"bold\":true},{\"text\":\" Ent\",\"color\":\"#542B0F\",\"bold\":true}]',ArmorItems:[{id:\"minecraft:leather_boots\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:3s}]}},{id:\"minecraft:leather_leggings\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:3s}]}},{id:\"minecraft:leather_chestplate\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:3s}]}},{id:\"minecraft:oak_leaves\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:3s}]}}],ArmorDropChances:[0.000F,0.000F,0.000F,0.000F],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}");
					loop = loop + 1;
				}
			}
			if (Math.random() <= 0.1) {
				loop = 0;
				pa = 3;
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
								"/summon husk ~ ~ ~ {HasVisualFire:0b,CustomNameVisible:1b,Health:50f,IsBaby:0b,CustomName:'{\"text\":\" Ent\",\"color\":\"#542B0F\",\"bold\":true}',HandItems:[{id:\"minecraft:oak_sapling\",Count:1b,tag:{Enchantments:[{}],AttributeModifiers:[{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:7,Operation:0,UUID:[I;-394254649,-117946760,-1212408528,-1840895778],Slot:\"mainhand\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:10,Operation:0,UUID:[I;-1124615338,1109344483,-1445258531,-2045609440],Slot:\"mainhand\"}]}},{}],HandDropChances:[0.000F,0.085F],ArmorItems:[{id:\"minecraft:leather_boots\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:10s}]}},{id:\"minecraft:leather_leggings\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:10s}]}},{id:\"minecraft:leather_chestplate\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:10s}]}},{id:\"minecraft:oak_leaves\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:10s}]}}],ArmorDropChances:[0.000F,0.000F,0.000F,0.000F],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:199999980,ShowParticles:0b}]}");
					loop = loop + 1;
				}
			}
			if (Math.random() <= 0.1) {
				for (int index2 = 0; index2 < (int) (500); index2++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Arrow(EntityType.ARROW, _level);
						entityToSpawn.moveTo((x + Mth.nextDouble(new Random(), -20, 20)), (Mth.nextDouble(new Random(), 10, 150)),
								(z + Mth.nextDouble(new Random(), -20, 20)), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
