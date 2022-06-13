package net.mcreator.morecookie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTree_Ent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("more_cookie", "model_tree_ent"), "main");
	public final ModelPart bb_main;

	public ModelTree_Ent(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(122, 68).addBox(-28.0F, -9.0F, -8.0F, 16.0F, 9.0F, 16.0F, new CubeDeformation(0.0F))
						.texOffs(110, 121).addBox(12.0F, -9.0F, -8.0F, 16.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(130, 28)
						.addBox(-27.0F, -18.0F, -7.0F, 13.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(126, 93)
						.addBox(14.0F, -18.0F, -7.0F, 13.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-16.0F, -60.0F, -8.0F, 7.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(144, 0)
						.addBox(-24.0F, -28.0F, -6.0F, 11.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(43, 137)
						.addBox(12.0F, -28.0F, -6.0F, 11.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(72, 42)
						.addBox(4.0F, -54.0F, -8.0F, 14.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(331, 123)
						.addBox(-11.0F, -77.0F, -7.0F, 21.0F, 41.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-1.0F, -63.0F, -8.0F, 17.0F, 22.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-14.0F, -69.0F, -8.0F, 18.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(72, 84)
						.addBox(-9.0F, -90.0F, -6.0F, 15.0F, 41.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(566, 17)
						.addBox(-25.0F, -102.0F, -14.0F, 47.0F, 27.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(566, 17)
						.addBox(-7.0F, -90.0F, -3.0F, 26.0F, 12.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(566, 17)
						.addBox(-29.0F, -99.0F, -7.0F, 17.0F, 12.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(566, 17)
						.addBox(-1.0F, -108.0F, -20.0F, 17.0F, 12.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(566, 17)
						.addBox(10.0F, -95.0F, -12.0F, 17.0F, 12.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 98).addBox(56.0F, 11.0F, -5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(56.0F, 11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(56.0F, 11.0F, 3.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(50.0F, 11.0F, 4.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98).addBox(48.0F, -12.0F, -5.0F, 9.0F,
								28.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 98).addBox(49.0F, -28.0F, -5.0F, 9.0F, 35.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 98).addBox(-53.0F, 11.0F, 4.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-59.0F, 11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-59.0F, 11.0F, -5.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-59.0F, 11.0F, 3.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98).addBox(-58.0F, -12.0F, -5.0F, 9.0F,
								28.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 98).addBox(-59.0F, -35.0F, -5.0F, 9.0F, 42.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9163F));
		return LayerDefinition.create(meshdefinition, 999, 999);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
