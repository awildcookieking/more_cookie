package net.mcreator.morecookie.procedures;

import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.morecookie.init.MoreCookieModItems;

import java.util.concurrent.atomic.AtomicReference;

public class SolarpanelUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ikoawjf = 0;
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
			ikoawjf = 0;
			for (int index0 = 0; index0 < (int) (9); index0++) {
				if (true == true) {
					if (MoreCookieModItems.SOLARCELL.get() == (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) ikoawjf)).getItem()) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
							int _amount = 1;
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.SOLARCELL_2.get() == (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) ikoawjf)).getItem()) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
							int _amount = 10;
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.SOLARCELL_3.get() == (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) ikoawjf)).getItem()) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
							int _amount = 100;
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.SOLARCELL_4.get() == (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) ikoawjf)).getItem()) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
							int _amount = 1000;
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
				}
				ikoawjf = ikoawjf + 1;
			}
		}
	}
}
