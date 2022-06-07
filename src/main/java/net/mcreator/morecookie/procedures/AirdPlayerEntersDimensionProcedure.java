package net.mcreator.morecookie.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.storage.WritableLevelData;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class AirdPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final int _slotid = 0;
			final ItemStack _setstack = new ItemStack(Blocks.DIRT);
			_setstack.setCount(32);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 1;
			final ItemStack _setstack = new ItemStack(Items.LAVA_BUCKET);
			_setstack.setCount(1);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 2;
			final ItemStack _setstack = new ItemStack(Items.WATER_BUCKET);
			_setstack.setCount(1);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 3;
			final ItemStack _setstack = new ItemStack(Blocks.OAK_SAPLING);
			_setstack.setCount(1);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 4;
			final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
			_setstack.setCount(10);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(0, 90, 0);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0, 90, 0, _ent.getYRot(), _ent.getXRot());
		}
		world.setBlock(new BlockPos(-1, 84, -1), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(0, 84, -1), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(1, 84, -1), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(-1, 84, 0), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(0, 84, 0), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(1, 84, 0), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(-1, 84, 1), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(0, 84, 1), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		world.setBlock(new BlockPos(1, 84, 1), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		if (world.getLevelData() instanceof WritableLevelData _levelData)
			_levelData.setSpawn(new BlockPos(0, 85, 0), 0);
	}
}
