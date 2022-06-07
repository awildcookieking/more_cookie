
package net.mcreator.morecookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecookie.entity.CerberusEntity;
import net.mcreator.morecookie.client.model.ModelCerberus;

public class CerberusRenderer extends MobRenderer<CerberusEntity, ModelCerberus<CerberusEntity>> {
	public CerberusRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCerberus(context.bakeLayer(ModelCerberus.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CerberusEntity entity) {
		return new ResourceLocation("more_cookie:textures/cerberus.png");
	}
}
