
package net.mcreator.morecookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecookie.entity.StatueEntity;
import net.mcreator.morecookie.client.model.Modelzeus;

public class StatueRenderer extends MobRenderer<StatueEntity, Modelzeus<StatueEntity>> {
	public StatueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzeus(context.bakeLayer(Modelzeus.LAYER_LOCATION)), 4.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StatueEntity entity) {
		return new ResourceLocation("more_cookie:textures/zeus.png");
	}
}
