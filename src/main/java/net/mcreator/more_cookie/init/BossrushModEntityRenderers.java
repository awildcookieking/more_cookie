
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.bossrush.client.renderer.TreeentRenderer;
import net.mcreator.bossrush.client.renderer.OrbinitegolemRenderer;
import net.mcreator.bossrush.client.renderer.NewmeteorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BossrushModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BossrushModEntities.NEWARROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BossrushModEntities.TREEENT.get(), TreeentRenderer::new);
		event.registerEntityRenderer(BossrushModEntities.NEWMETEOR.get(), NewmeteorRenderer::new);
		event.registerEntityRenderer(BossrushModEntities.ORBINITEGOLEM.get(), OrbinitegolemRenderer::new);
	}
}
