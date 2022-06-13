
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.bossrush.fluid.LiquidstartlightFluid;
import net.mcreator.bossrush.BossrushMod;

public class BossrushModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BossrushMod.MODID);
	public static final RegistryObject<Fluid> LIQUIDSTARTLIGHT = REGISTRY.register("liquidstartlight", () -> new LiquidstartlightFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIQUIDSTARTLIGHT = REGISTRY.register("flowing_liquidstartlight",
			() -> new LiquidstartlightFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUIDSTARTLIGHT.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUIDSTARTLIGHT.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
