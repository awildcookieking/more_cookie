
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.morecookie.client.renderer.StatueRenderer;
import net.mcreator.morecookie.client.renderer.ReaperRenderer;
import net.mcreator.morecookie.client.renderer.PoseidonRenderer;
import net.mcreator.morecookie.client.renderer.HadesRenderer;
import net.mcreator.morecookie.client.renderer.CerberusRenderer;
import net.mcreator.morecookie.client.renderer.ActualstatueRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreCookieModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MoreCookieModEntities.STATUE.get(), StatueRenderer::new);
		event.registerEntityRenderer(MoreCookieModEntities.ACTUALSTATUE.get(), ActualstatueRenderer::new);
		event.registerEntityRenderer(MoreCookieModEntities.HADES.get(), HadesRenderer::new);
		event.registerEntityRenderer(MoreCookieModEntities.CERBERUS.get(), CerberusRenderer::new);
		event.registerEntityRenderer(MoreCookieModEntities.POSEIDON.get(), PoseidonRenderer::new);
		event.registerEntityRenderer(MoreCookieModEntities.REAPER.get(), ReaperRenderer::new);
	}
}
