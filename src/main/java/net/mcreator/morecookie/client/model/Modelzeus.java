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
public class Modelzeus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("more_cookie", "modelzeus"), "main");
	public final ModelPart bb_main;

	public Modelzeus(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(724, 14).addBox(-19.0F, -78.0F, -21.0F, 45.0F, 41.0F, 46.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-41.0F, -30.0F, -17.0F, 38.0F, 24.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(15.0F, -15.0F, -11.0F, 38.0F, 21.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -20.0F, -39.0F, 38.0F, 21.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.0F, -20.0F, -1.0F, 38.0F, 21.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-33.0F, -25.0F, -29.0F, 73.0F, 25.0F, 61.0F, new CubeDeformation(0.0F)).texOffs(724, 14)
						.addBox(-28.0F, -46.0F, -26.0F, 56.0F, 28.0F, 55.0F, new CubeDeformation(0.0F)).texOffs(724, 14)
						.addBox(-15.0F, -102.0F, -15.0F, 40.0F, 47.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(800, 247)
						.addBox(-7.0F, -164.0F, -10.0F, 22.0F, 21.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(881, 432).addBox(-96.0F, -109.0F, 0.0F, 7.0F, 64.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(881, 432).addBox(-79.0F, -60.0F, 0.0F, 7.0F, 64.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(822, 471).addBox(-88.0F, 40.0F, 0.0F, 7.0F, 24.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(800, 247).addBox(71.0F, -111.0F, -2.0F, 11.0F, 54.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(800, 247).addBox(-104.0F, -16.0F, -3.0F, 11.0F, 20.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(800, 247).addBox(-94.0F, -95.0F, -2.0F, 11.0F, 54.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(800, 247).addBox(-45.0F, -137.0F, -7.0F, 28.0F, 47.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(800, 247).addBox(26.0F, -134.0F, -7.0F, 27.0F, 47.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
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
