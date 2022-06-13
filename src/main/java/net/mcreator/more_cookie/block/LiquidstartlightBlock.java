
package net.mcreator.bossrush.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.bossrush.procedures.LiquidstartlightMobplayerCollidesBlockProcedure;
import net.mcreator.bossrush.init.BossrushModFluids;

public class LiquidstartlightBlock extends LiquidBlock {
	public LiquidstartlightBlock() {
		super(() -> (FlowingFluid) BossrushModFluids.LIQUIDSTARTLIGHT.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

				.lightLevel(s -> 15));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		LiquidstartlightMobplayerCollidesBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
