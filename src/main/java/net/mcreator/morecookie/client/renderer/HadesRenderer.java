
package net.mcreator.morecookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecookie.entity.HadesEntity;
import net.mcreator.morecookie.client.model.Modelcustom_model;

public class HadesRenderer extends MobRenderer<HadesEntity, Modelcustom_model<HadesEntity>> {
	public HadesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 4.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HadesEntity entity) {
		return new ResourceLocation("more_cookie:textures/hades.png");
	}
}
