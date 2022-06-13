
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bossrush.client.model.Modelmeteor;
import net.mcreator.bossrush.client.model.ModelTree_Ent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BossrushModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTree_Ent.LAYER_LOCATION, ModelTree_Ent::createBodyLayer);
		event.registerLayerDefinition(Modelmeteor.LAYER_LOCATION, Modelmeteor::createBodyLayer);
	}
}
