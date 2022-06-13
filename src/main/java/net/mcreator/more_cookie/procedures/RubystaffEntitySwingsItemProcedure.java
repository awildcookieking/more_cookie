package net.mcreator.bossrush.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bossrush.init.BossrushModMobEffects;
import net.mcreator.bossrush.init.BossrushModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Comparator;

public class RubystaffEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double power = 0;
		power = 120;
		if (BossrushModItems.MANACRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, itemstack)).getItem()) {
			if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((((Entity) world
													.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream()
													.sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()),
													(((Entity) world
															.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY()),
													(((Entity) world
															.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true)
															.stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())),
											Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon area_effect_cloud ~ ~ ~ {Particle:\"flame\",Radius:1.5f,RadiusPerTick:0f,RadiusOnUse:0f,Duration:100}");
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_BOOTS.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SAPHIRE_ARMOR_BOOTS.get()) {
					power = 20 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_BOOTS.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SILVER_ARMOR_BOOTS.get()) {
					power = 40 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.JADE_ARMOR_BOOTS.get()) {
					power = 60 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.ORBINITE_ARMOR_BOOTS.get()) {
					power = 80 + power;
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_LEGGINGS.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SAPHIRE_ARMOR_LEGGINGS.get()) {
					power = 20 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_LEGGINGS.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SILVER_ARMOR_LEGGINGS.get()) {
					power = 40 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.JADE_ARMOR_LEGGINGS.get()) {
					power = 60 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.ORBINITE_ARMOR_LEGGINGS.get()) {
					power = 80 + power;
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_CHESTPLATE.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SAPHIRE_ARMOR_CHESTPLATE.get()) {
					power = 20 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_CHESTPLATE.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SILVER_ARMOR_CHESTPLATE.get()) {
					power = 40 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.JADE_ARMOR_CHESTPLATE.get()) {
					power = 60 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.ORBINITE_ARMOR_CHESTPLATE.get()) {
					power = 80 + power;
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_HELMET.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SAPHIRE_ARMOR_HELMET.get()) {
					power = 20 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_HELMET.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == BossrushModItems.SILVER_ARMOR_HELMET.get()) {
					power = 40 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.JADE_ARMOR_HELMET.get()) {
					power = 60 + power;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.ORBINITE_ARMOR_HELMET.get()) {
					power = 80 + power;
				}
				if (((Entity) world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream()
						.sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BossrushModMobEffects.BURN.get(), (int) power, 0));
				{
					ItemStack _isc = itemstack;
					final ItemStack _setstack = new ItemStack(BossrushModItems.MANACRYSTAL.get());
					final int _sltid = 0;
					_setstack.setCount((int) (((new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(0, itemstack))).getCount() - 1));
					_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
	}
}
