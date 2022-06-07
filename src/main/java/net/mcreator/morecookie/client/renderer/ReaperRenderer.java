
package net.mcreator.morecookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecookie.entity.ReaperEntity;
import net.mcreator.morecookie.client.model.ModelVoid_Reaper;

public class ReaperRenderer extends MobRenderer<ReaperEntity, ModelVoid_Reaper<ReaperEntity>> {
	public ReaperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVoid_Reaper(context.bakeLayer(ModelVoid_Reaper.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ReaperEntity entity) {
		return new ResourceLocation("more_cookie:textures/void_reaper.png");
	}
}
