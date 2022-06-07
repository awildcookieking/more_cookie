package net.mcreator.morecookie.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Comparator;

public class StatueEntityIsHurtProcedure {
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
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")), SoundSource.MASTER, (float) 0.3,
								5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.thunder")),
								SoundSource.MASTER, (float) 0.3, 5, false);
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 50;
					xr = 15;
					zr = 15;
					while (loop < pa) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr, y,
									z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)));
							entityToSpawn.setVisualOnly(false);
							_level.addFreshEntity(entityToSpawn);
						}
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 8;
					xr = 15;
					zr = 15;
					while (loop < pa) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), y,
													(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"summon piglin_brute ~ ~ ~ {IsImmuneToZombification:1b}");
						loop = loop + 1;
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
									"/summon piglin_brute ~ ~ ~ {IsImmuneToZombification:1b,CustomName:'{\"text\":\"Guard\",\"color\":\"gold\",\"bold\":true}',HandItems:[{id:\"minecraft:wooden_axe\",Count:1b},{}]}");
						loop = loop + 1;
					}
				}
				if (Math.random() <= 0.1) {
					for (int index3 = 0; index3 < (int) (8); index3++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performCommand(
											new CommandSourceStack(CommandSource.NULL,
													new Vec3((Math.random() * 30 - Math.random() * 30), (Math.random() * 30 - Math.random() * 30),
															(Math.random() * 30 - Math.random() * 30)),
													Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon dragon_fireball ~ ~ ~ {power:[0.0,-0.5,0.0]}");
					}
				}
				if (Math.random() <= 0.1) {
					for (int index4 = 0; index4 < (int) (300); index4++) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + Math.random() * 30 - Math.random() * 30),
													(y + Math.random() * 30 - Math.random() * 30), (z + Math.random() * 30 - Math.random() * 30)),
													Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon arrow ~ ~ ~ {HasVisualFire:1b,Glowing:1b,Owner:[I;-285522557,1803241961,-1919495762,1954093591],Passengers:[{id:\"minecraft:lightning_bolt\"}],CustomName:'{\"text\":\"budget Lightning\",\"color\":\"gold\",\"bold\":true}',SoundEvent:\"weather.rain.above\"}");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + Math.random() * 30 - Math.random() * 30),
													(y + Math.random() * 30 - Math.random() * 30), (z + Math.random() * 30 - Math.random() * 30)),
													Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon arrow ~ ~ ~ {HasVisualFire:1b,Glowing:1b,Owner:[I;-285522557,1803241961,-1919495762,1954093591],Passengers:[{id:\"minecraft:lightning_bolt\"}],CustomName:'{\"text\":\"budget Lightning\",\"color\":\"gold\",\"bold\":true}',SoundEvent:\"weather.rain.above\"}");
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + Math.random() * 30 - Math.random() * 30),
													(y + Math.random() * 30 - Math.random() * 30), (z + Math.random() * 30 - Math.random() * 30)),
													Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"/summon arrow ~ ~ ~ {HasVisualFire:1b,Glowing:1b,Owner:[I;-285522557,1803241961,-1919495762,1954093591],Passengers:[{id:\"minecraft:lightning_bolt\"}],CustomName:'{\"text\":\"budget Lightning\",\"color\":\"gold\",\"bold\":true}',SoundEvent:\"weather.rain.above\"}");
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 10);
					}
				}
				if (Math.random() <= 0.1) {
					loop = 0;
					pa = 100;
					xr = 15;
					zr = 15;
					while (loop < pa) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr, y,
									z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)));
							entityToSpawn.setVisualOnly(false);
							_level.addFreshEntity(entityToSpawn);
						}
						loop = loop + 1;
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("counter1", (new Object() {
									public double getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getDouble(tag);
										return -1;
									}
								}.getValue(world, new BlockPos(x, y, z), "counter1") + 1));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "counter1") >= 20) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performCommand(
										new CommandSourceStack(
												CommandSource.NULL,
												new Vec3(
														(x + 0.5 + Math.cos(((Math.PI * 2) / pa) * loop) * xr), y,
														(z + 0.5 + Math.sin(((Math.PI * 2) / pa) * loop) * zr)),
												Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon piglin_brute ~ ~ ~ {IsImmuneToZombification:1b,CustomName:'{\"text\":\"Guard\",\"color\":\"gold\",\"bold\":true}',HandItems:[{id:\"minecraft:wooden_axe\",Count:1b},{}]}");
						}
					}
				}
			}
		}
	}
}
