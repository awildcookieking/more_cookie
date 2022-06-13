package net.mcreator.bossrush.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.bossrush.init.BossrushModItems;
import net.mcreator.bossrush.entity.NewmeteorEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OscProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double power = 0;
		power = 1;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_BOOTS.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_BOOTS.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.SILVER_ARMOR_BOOTS.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.SAPHIRE_ARMOR_BOOTS.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.JADE_ARMOR_BOOTS.get()) {
			power = power + 0.6;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.ORBINITE_ARMOR_BOOTS.get()) {
			power = power + 1;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_LEGGINGS.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_LEGGINGS.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.SILVER_ARMOR_LEGGINGS.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.SAPHIRE_ARMOR_LEGGINGS.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.JADE_ARMOR_LEGGINGS.get()) {
			power = power + 0.6;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.ORBINITE_ARMOR_LEGGINGS.get()) {
			power = power + 1;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_CHESTPLATE.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_CHESTPLATE.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.SILVER_ARMOR_CHESTPLATE.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.SAPHIRE_ARMOR_CHESTPLATE.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.JADE_ARMOR_CHESTPLATE.get()) {
			power = power + 0.6;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.ORBINITE_ARMOR_CHESTPLATE.get()) {
			power = power + 1;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_HELMET.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.RUBY_ARMOR_HELMET.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.SILVER_ARMOR_HELMET.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == BossrushModItems.SAPHIRE_ARMOR_HELMET.get()) {
			power = power + 0.2;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.JADE_ARMOR_HELMET.get()) {
			power = power + 0.6;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == BossrushModItems.ORBINITE_ARMOR_HELMET.get()) {
			power = power + 1;
		}
		if (0 < (entity instanceof Player _plr ? _plr.experienceLevel : 0)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Mob) {
						if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
							NewmeteorEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), (float) (0.5 + power), (float) (5 + power),
									(int) (1 + power));
						}
					}
				}
			}
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(1));
		}
	}
}
