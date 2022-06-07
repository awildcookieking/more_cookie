
package net.mcreator.morecookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecookie.entity.ActualstatueEntity;
import net.mcreator.morecookie.client.model.ModelZeus_Statue;

public class ActualstatueRenderer extends MobRenderer<ActualstatueEntity, ModelZeus_Statue<ActualstatueEntity>> {
	public ActualstatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelZeus_Statue(context.bakeLayer(ModelZeus_Statue.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ActualstatueEntity entity) {
		return new ResourceLocation("more_cookie:textures/zeus_statue.png");
	}
}
