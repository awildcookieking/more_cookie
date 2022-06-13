package net.mcreator.bossrush.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.bossrush.init.BossrushModItems;
import net.mcreator.bossrush.entity.NewarrowEntity;

import java.util.concurrent.atomic.AtomicReference;

public class OpalstaffcodeProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double power = 0;
		power = 1;
		if (BossrushModItems.MANACRYSTAL.get() == (new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, itemstack)).getItem()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SAPHIRE_ARMOR_BOOTS.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.RUBY_ARMOR_BOOTS.get()) {
				power = power + 0.2;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SILVER_ARMOR_BOOTS.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_BOOTS.get()) {
				power = power + 0.4;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.JADE_ARMOR_BOOTS.get()) {
				power = power + 0.6;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.ORBINITE_ARMOR_BOOTS.get()) {
				power = power + 0.8;
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SAPHIRE_ARMOR_LEGGINGS.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.RUBY_ARMOR_LEGGINGS.get()) {
				power = power + 0.2;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SILVER_ARMOR_LEGGINGS.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_LEGGINGS.get()) {
				power = power + 0.4;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.JADE_ARMOR_LEGGINGS.get()) {
				power = power + 0.6;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.ORBINITE_ARMOR_LEGGINGS.get()) {
				power = power + 0.8;
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SAPHIRE_ARMOR_CHESTPLATE.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.RUBY_ARMOR_CHESTPLATE.get()) {
				power = power + 0.2;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SILVER_ARMOR_CHESTPLATE.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_CHESTPLATE.get()) {
				power = power + 0.4;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.JADE_ARMOR_CHESTPLATE.get()) {
				power = power + 0.6;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.ORBINITE_ARMOR_CHESTPLATE.get()) {
				power = power + 0.8;
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SAPHIRE_ARMOR_HELMET.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.RUBY_ARMOR_HELMET.get()) {
				power = power + 0.2;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.SILVER_ARMOR_HELMET.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == BossrushModItems.OPAL_ARMOR_ARMOR_HELMET.get()) {
				power = power + 0.4;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.JADE_ARMOR_HELMET.get()) {
				power = power + 0.6;
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == BossrushModItems.ORBINITE_ARMOR_HELMET.get()) {
				power = power + 0.8;
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				NewarrowEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), (float) (power * 2), (float) power, (int) (power * 15));
			}
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
