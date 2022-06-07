package net.mcreator.morecookie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.morecookie.init.MoreCookieModEntities;
import net.mcreator.morecookie.entity.CerberusEntity;

import java.util.Comparator;

public class ReapercProcedure {
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
		if (world instanceof ServerLevel _level)
			_level.setDayTime(18000);
		if (true == !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
			if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == sourceentity) {
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 60;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon husk ~ ~ ~ {Health:150f,ArmorItems:[{},{},{},{id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:\"Byere\"}}],ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],Attributes:[{Name:generic.attack_damage,Base:20}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 100;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon drowned ~ ~ ~ {Health:150f,HandItems:[{id:\"minecraft:trident\",Count:1b},{}],ArmorItems:[{},{},{},{id:\"minecraft:player_head\",Count:1b,tag:{SkullOwner:\"Byere\"}}],ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],Attributes:[{Name:generic.attack_damage,Base:20}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					for (int index2 = 0; index2 < (int) (400); index2++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performCommand(
											new CommandSourceStack(CommandSource.NULL,
													new Vec3((x + Math.random() * 20 - Math.random() * 20), (y + 30),
															(z + Math.random() * 20 - Math.random() * 20)),
													Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon wither_skull ~ ~ ~ {power:[0.0,-0.1,0.0]}");
					}
				}
				if (Math.random() <= 0.1) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 239, 4, (false), (false)));
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 240, 4, (false), (false)));
					for (int index3 = 0; index3 < (int) (10); index3++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 3),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon pillager ~ ~ ~ {HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{Enchantments:[{id:\"minecraft:mending\",lvl:1s},{id:\"minecraft:multishot\",lvl:1s},{id:\"minecraft:piercing\",lvl:5s},{id:\"minecraft:quick_charge\",lvl:5s}]}},{}],HandDropChances:[0.000F,0.085F],ArmorItems:[{},{},{},{id:'minecraft:player_head',Count:1b,tag:{SkullOwner:'Byere'}}],ArmorDropChances:[0.085F,0.085F,0.085F,0.085F]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index4 = 0; index4 < (int) (12); index4++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 3),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon bat ~ ~ ~ {Health:300f,Passengers:[{id:\"minecraft:witch\"},{id:\"minecraft:witch\"},{id:\"minecraft:witch\"},{id:\"minecraft:witch\"},{id:\"minecraft:witch\"}]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index5 = 0; index5 < (int) (2); index5++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 3),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon ravager ~ ~ ~ {Health:300f,Passengers:[{id:\"minecraft:pillager\",HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{Enchantments:[{id:\"minecraft:multishot\",lvl:1s},{id:\"minecraft:piercing\",lvl:1s},{id:\"minecraft:quick_charge\",lvl:5s}],ChargedProjectiles:[{id:\"minecraft:firework_rocket\",Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:\"minecraft:firework_rocket\",Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:\"minecraft:firework_rocket\",Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]},{id:\"minecraft:pillager\",HandItems:[{id:'minecraft:crossbow',Count:1b,tag:{Enchantments:[{id:'minecraft:multishot',lvl:1s},{id:'minecraft:piercing',lvl:1s},{id:'minecraft:quick_charge',lvl:5s}],ChargedProjectiles:[{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}},{id:'minecraft:firework_rocket',Count:1b,tag:{Fireworks:{Flight:10b,Explosions:[{Type:1,Flicker:1b,Trail:1b,Colors:[I;0],FadeColors:[I;0]}]}}}],Charged:1b}},{}]}]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index6 = 0; index6 < (int) (8); index6++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 3),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon phantom ~ ~ ~ {Health:300f,Size:20,Passengers:[{id:\"minecraft:stray\",HandItems:[{id:\"minecraft:bow\",Count:1b,tag:{Enchantments:[{id:\"minecraft:power\",lvl:3s},{id:\"minecraft:punch\",lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]}],A/summon phantom ~ ~ ~ {Health:500f,Size:30,Passengers:[{id:\"minecraft:stray\",HandItems:[{id:\"minecraft:bow\",Count:1b,tag:{Enchantments:[{id:\"minecraft:power\",lvl:3s},{id:\"minecraft:punch\",lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]},{id:\"minecraft:stray\",HandItems:[{id:'minecraft:bow',Count:1b,tag:{Enchantments:[{id:'minecraft:power',lvl:3s},{id:'minecraft:punch',lvl:5s}]}},{}]}],Attributes:[{Name:generic.attack_damage,Base:1}]}ttributes:[{Name:generic.tack_damage,Base:1}]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index7 = 0; index7 < (int) (2); index7++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 3),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon elder_guardian ~ ~ ~ {Passengers:[{id:\"minecraft:guardian\"},{id:\"minecraft:guardian\"},{id:\"minecraft:guardian\"},{id:\"minecraft:guardian\"},{id:\"minecraft:guardian\"}]}");
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 25;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon elder_guardian ~ ~ ~ {Health:50f,Attributes:[{Name:generic.attack_damage,Base:5}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 40;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon piglin_brute ~ ~ ~ {Health:50f,IsImmuneToZombification:1b,HandItems:[{id:\"minecraft:netherite_axe\",Count:1b,tag:{Enchantments:[{id:\"minecraft:sharpness\",lvl:3s}]}},{}]}");
						loop = loop + 1;
					}
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
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon husk ~ ~ ~ {Health:50f,Passengers:[{id:\"minecraft:witch\",Health:50f,ActiveEffects:[{Id:28b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]}],HandItems:[{id:\"minecraft:netherite_axe\",Count:1b,tag:{Enchantments:[{id:\"minecraft:sharpness\",lvl:3s}]}},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 4;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon skeleton ~ ~ ~ {Passengers:[{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:\"minecraft:trident\",Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]},{id:\"minecraft:drowned\",Health:1f,HandItems:[{id:'minecraft:trident',Count:1b},{}],ActiveEffects:[{Id:14b,Amplifier:1b,Duration:19999980,ShowParticles:0b}]}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 20;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon blaze ~ ~ ~ {Health:100f}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"/title @a title [{\"text\":\"YOU THINK YOU CAN BEAT ME?!?!?!?\",\"color\":\"black\",\"bold\":true},{\"text\":\" GOOD BYE\",\"color\":\"dark_red\",\"bold\":true}]");
					loop = 0;
					pa = 20;
					xr = 20;
					zr = 20;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon area_effect_cloud ~ ~ ~ {Particle:\"large_smoke\",Radius:10f,RadiusPerTick:9f,RadiusOnUse:9f,Duration:200}");
						loop = loop + 1;
					}
					loop = 0;
					pa = 4;
					xr = 5;
					zr = 5;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 2),
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon rabbit ~ ~ ~ {CustomNameVisible:1b,Health:1000f,RabbitType:99,CustomName:'{\"text\":\"BUNNY\",\"color\":\"black\",\"bold\":true}',HandItems:[{id:\"minecraft:netherite_axe\",Count:1b,tag:{Enchantments:[{id:\"minecraft:sharpness\",lvl:10s}]}},{id:\"minecraft:netherite_axe\",Count:1b,tag:{Enchantments:[{id:\"minecraft:sharpness\",lvl:10s}]}}],ArmorItems:[{},{},{},{id:\"minecraft:netherite_axe\",Count:1b,tag:{Enchantments:[{id:\"minecraft:sharpness\",lvl:10s}]}}],ArmorDropChances:[0.085F,0.085F,0.085F,0.000F],Attributes:[{Name:generic.follow_range,Base:40},{Name:generic.movement_speed,Base:1},{Name:generic.attack_damage,Base:1000}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					for (int index15 = 0; index15 < (int) (200); index15++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 20),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon arrow ~ ~ ~ {SoundEvent:\"entity.ender_dragon.death\",CustomPotionEffects:[{Id:20b,Amplifier:9b,Duration:600,ShowParticles:0b}]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index16 = 0; index16 < (int) (600); index16++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((x + Math.random() * 20 - Math.random() * 20), (y + 20),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon snowball ~ ~ ~ {Motion:[0.0,-0.1,0.0],Item:{id:\"minecraft:tnt\",Count:1b}}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index17 = 0; index17 < (int) (6); index17++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 3),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon vindicator ~ ~ ~ {HandItems:[{id:\"minecraft:netherite_axe\",Count:1b,tag:{Unbreakable:1b,Enchantments:[{id:\"minecraft:sharpness\",lvl:15s}]}},{}],HandDropChances:[0.000F,0.085F],ArmorItems:[{},{},{id:\"minecraft:netherite_chestplate\",Count:1b,tag:{Enchantments:[{id:\"minecraft:fire_protection\",lvl:10s},{id:\"minecraft:blast_protection\",lvl:10s},{id:\"minecraft:projectile_protection\",lvl:10s},{id:\"minecraft:thorns\",lvl:10s}]}},{}],ArmorDropChances:[0.085F,0.085F,0.000F,0.085F]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index18 = 0; index18 < (int) (6); index18++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(
											CommandSource.NULL,
											new Vec3(
													(x + Math.random() * 20 - Math.random() * 20), (y + 5),
													(z + Math.random() * 20 - Math.random() * 20)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon giant ~ ~ ~ {Health:50f,Passengers:[{id:\"minecraft:drowned\",Health:30f,HandItems:[{id:\"minecraft:trident\",Count:1b},{}]},{id:\"minecraft:drowned\",Health:30f,HandItems:[{id:'minecraft:trident',Count:1b},{}]},{id:\"minecraft:drowned\",Health:30f,HandItems:[{id:'minecraft:trident',Count:1b},{}]},{id:\"minecraft:drowned\",Health:30f,HandItems:[{id:'minecraft:trident',Count:1b},{}]},{id:\"minecraft:drowned\",Health:30f,HandItems:[{id:'minecraft:trident',Count:1b},{}]}]}");
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 5;
					xr = 10;
					zr = 10;
					while (loop < pa) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new CerberusEntity(MoreCookieModEntities.CERBERUS.get(), _level);
							entityToSpawn.moveTo((x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), (y + 10),
									(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						loop = loop + 1;
					}
				}
			}
		}
	}
}
