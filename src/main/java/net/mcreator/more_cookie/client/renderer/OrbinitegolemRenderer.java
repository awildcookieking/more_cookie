
package net.mcreator.bossrush.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.bossrush.entity.OrbinitegolemEntity;

public class OrbinitegolemRenderer extends MobRenderer<OrbinitegolemEntity, ChickenModel<OrbinitegolemEntity>> {
	public OrbinitegolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrbinitegolemEntity entity) {
		return new ResourceLocation("bossrush:textures/saphire_gem.png");
	}
}
