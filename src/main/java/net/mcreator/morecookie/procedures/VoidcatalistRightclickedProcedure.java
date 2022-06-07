package net.mcreator.morecookie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.morecookie.init.MoreCookieModEntities;
import net.mcreator.morecookie.entity.ReaperEntity;

public class VoidcatalistRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new ReaperEntity(MoreCookieModEntities.REAPER.get(), _level);
			entityToSpawn.moveTo(x, y, z, 60, 60);
			entityToSpawn.setYBodyRot(60);
			entityToSpawn.setYHeadRot(60);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		(itemstack).shrink(1);
	}
}
