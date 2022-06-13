
package net.mcreator.bossrush.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bossrush.entity.TreeentEntity;
import net.mcreator.bossrush.client.model.ModelTree_Ent;

public class TreeentRenderer extends MobRenderer<TreeentEntity, ModelTree_Ent<TreeentEntity>> {
	public TreeentRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTree_Ent(context.bakeLayer(ModelTree_Ent.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TreeentEntity entity) {
		return new ResourceLocation("bossrush:textures/tree_ent.png");
	}
}
