
package net.mcreator.morecookie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.morecookie.entity.PoseidonEntity;
import net.mcreator.morecookie.client.model.ModelPoseidon;

public class PoseidonRenderer extends MobRenderer<PoseidonEntity, ModelPoseidon<PoseidonEntity>> {
	public PoseidonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPoseidon(context.bakeLayer(ModelPoseidon.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(PoseidonEntity entity) {
		return new ResourceLocation("more_cookie:textures/poseidon_body.png");
	}
}
