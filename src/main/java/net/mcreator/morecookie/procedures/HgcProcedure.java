package net.mcreator.morecookie.procedures;

import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.morecookie.init.MoreCookieModItems;

import java.util.concurrent.atomic.AtomicReference;

public class HgcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ikoawjf = 0;
		double xx = 0;
		double yy = 0;
		double zz = 0;
		double amount = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH) {
			xx = x + 0;
			yy = y + 0;
			zz = z + 1;
			ikoawjf = 0;
			if (true == true) {
				sx = -3;
				amount = 0;
				for (int index0 = 0; index0 < (int) (6); index0++) {
					sy = -3;
					for (int index1 = 0; index1 < (int) (6); index1++) {
						sz = -3;
						for (int index2 = 0; index2 < (int) (6); index2++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
								amount = amount + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				for (int index3 = 0; index3 < (int) (9); index3++) {
					if (MoreCookieModItems.HEATCELL.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (1 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.HEATCELL_2.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (10 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					ikoawjf = ikoawjf + 1;
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z))) == Direction.EAST) {
			xx = x - 1;
			yy = y + 0;
			zz = z + 0;
			ikoawjf = 0;
			if (true == true) {
				sx = -3;
				amount = 0;
				for (int index4 = 0; index4 < (int) (6); index4++) {
					sy = -3;
					for (int index5 = 0; index5 < (int) (6); index5++) {
						sz = -3;
						for (int index6 = 0; index6 < (int) (6); index6++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
								amount = amount + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				for (int index7 = 0; index7 < (int) (9); index7++) {
					if (MoreCookieModItems.HEATCELL.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (1 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.HEATCELL_2.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (10 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					ikoawjf = ikoawjf + 1;
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH) {
			xx = x + 0;
			yy = y + 0;
			zz = z - 1;
			ikoawjf = 0;
			if (true == true) {
				sx = -3;
				amount = 0;
				for (int index8 = 0; index8 < (int) (6); index8++) {
					sy = -3;
					for (int index9 = 0; index9 < (int) (6); index9++) {
						sz = -3;
						for (int index10 = 0; index10 < (int) (6); index10++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
								amount = amount + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				for (int index11 = 0; index11 < (int) (9); index11++) {
					if (MoreCookieModItems.HEATCELL.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (1 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.HEATCELL_2.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (10 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					ikoawjf = ikoawjf + 1;
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z))) == Direction.WEST) {
			xx = x + 1;
			yy = y + 0;
			zz = z + 0;
			ikoawjf = 0;
			if (true == true) {
				sx = -3;
				amount = 0;
				for (int index12 = 0; index12 < (int) (6); index12++) {
					sy = -3;
					for (int index13 = 0; index13 < (int) (6); index13++) {
						sz = -3;
						for (int index14 = 0; index14 < (int) (6); index14++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
								amount = amount + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				for (int index15 = 0; index15 < (int) (9); index15++) {
					if (MoreCookieModItems.HEATCELL.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (1 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.HEATCELL_2.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (10 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					ikoawjf = ikoawjf + 1;
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z))) == Direction.UP) {
			xx = x + 0;
			yy = y - 1;
			zz = z + 0;
			ikoawjf = 0;
			if (true == true) {
				sx = -3;
				amount = 0;
				for (int index16 = 0; index16 < (int) (6); index16++) {
					sy = -3;
					for (int index17 = 0; index17 < (int) (6); index17++) {
						sz = -3;
						for (int index18 = 0; index18 < (int) (6); index18++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
								amount = amount + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				for (int index19 = 0; index19 < (int) (9); index19++) {
					if (MoreCookieModItems.HEATCELL.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (1 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.HEATCELL_2.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (10 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					ikoawjf = ikoawjf + 1;
				}
			}
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z))) == Direction.DOWN) {
			xx = x + 0;
			yy = y + 1;
			zz = z + 0;
			ikoawjf = 0;
			if (true == true) {
				sx = -3;
				amount = 0;
				for (int index20 = 0; index20 < (int) (6); index20++) {
					sy = -3;
					for (int index21 = 0; index21 < (int) (6); index21++) {
						sz = -3;
						for (int index22 = 0; index22 < (int) (6); index22++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
								amount = amount + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				for (int index23 = 0; index23 < (int) (9); index23++) {
					if (MoreCookieModItems.HEATCELL.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (1 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					if (MoreCookieModItems.HEATCELL_2.get() == (new Object() {
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
							BlockEntity _ent = world.getBlockEntity(new BlockPos(xx, yy, zz));
							int _amount = (int) (10 * amount);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
						}
					}
					ikoawjf = ikoawjf + 1;
				}
			}
		}
	}
}
