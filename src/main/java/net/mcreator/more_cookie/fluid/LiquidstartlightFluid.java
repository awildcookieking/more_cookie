
package net.mcreator.bossrush.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bossrush.init.BossrushModItems;
import net.mcreator.bossrush.init.BossrushModFluids;
import net.mcreator.bossrush.init.BossrushModBlocks;

public abstract class LiquidstartlightFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BossrushModFluids.LIQUIDSTARTLIGHT,
			BossrushModFluids.FLOWING_LIQUIDSTARTLIGHT, FluidAttributes
					.builder(new ResourceLocation("bossrush:blocks/starlight"), new ResourceLocation("bossrush:blocks/starlight")).luminosity(100)

	).explosionResistance(100f)

			.tickRate(15)

			.slopeFindDistance(1).bucket(BossrushModItems.LIQUIDSTARTLIGHT_BUCKET)
			.block(() -> (LiquidBlock) BossrushModBlocks.LIQUIDSTARTLIGHT.get());

	private LiquidstartlightFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(15);
	}

	public static class Source extends LiquidstartlightFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidstartlightFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
