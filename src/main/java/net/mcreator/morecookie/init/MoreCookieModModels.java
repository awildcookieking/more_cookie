
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.morecookie.client.model.Modelzeus;
import net.mcreator.morecookie.client.model.Modelmeteor;
import net.mcreator.morecookie.client.model.Modelcustom_model;
import net.mcreator.morecookie.client.model.ModelZeus_Statue;
import net.mcreator.morecookie.client.model.ModelVoid_Reaper;
import net.mcreator.morecookie.client.model.ModelTree_Ent;
import net.mcreator.morecookie.client.model.ModelPoseidon;
import net.mcreator.morecookie.client.model.ModelCerberus;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MoreCookieModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTree_Ent.LAYER_LOCATION, ModelTree_Ent::createBodyLayer);
		event.registerLayerDefinition(Modelzeus.LAYER_LOCATION, Modelzeus::createBodyLayer);
		event.registerLayerDefinition(ModelPoseidon.LAYER_LOCATION, ModelPoseidon::createBodyLayer);
		event.registerLayerDefinition(ModelCerberus.LAYER_LOCATION, ModelCerberus::createBodyLayer);
		event.registerLayerDefinition(Modelmeteor.LAYER_LOCATION, Modelmeteor::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelZeus_Statue.LAYER_LOCATION, ModelZeus_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelVoid_Reaper.LAYER_LOCATION, ModelVoid_Reaper::createBodyLayer);
	}
}
