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
public class ModelCerberus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("more_cookie", "model_cerberus"), "main");
	public final ModelPart bb_main;

	public ModelCerberus(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 141).addBox(-33.0F, -44.0F, -24.0F, 14.0F, 44.0F, 14.0F, new CubeDeformation(0.0F))
						.texOffs(112, 83).addBox(-33.0F, -44.0F, 11.0F, 14.0F, 44.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 83)
						.addBox(27.0F, -44.0F, -24.0F, 14.0F, 44.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(27.0F, -44.0F, 11.0F, 14.0F, 44.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-33.0F, -66.0F, -24.0F, 74.0F, 28.0F, 49.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(34.0F, -93.0F, -14.0F, 31.0F, 23.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(46.0F, -84.0F, -12.0F, 31.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(56, 83)
						.addBox(34.0F, -8.0F, -24.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 83)
						.addBox(34.0F, -8.0F, 11.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 83)
						.addBox(-27.0F, -8.0F, 11.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 83)
						.addBox(-27.0F, -8.0F, -24.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(402, 309).addBox(28.0F, -64.0F, -85.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(402, 309).addBox(28.0F, -64.0F, -80.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(402, 309)
						.addBox(25.0F, -55.0F, -85.0F, 13.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(332, 194)
						.addBox(22.0F, -54.0F, -86.0F, 16.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0848F, 0.4981F, -2.6715F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(332, 194).addBox(-38.0F, -63.0F, -86.0F, 16.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7494F, 0.3204F, 2.5732F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(332, 194).addBox(2.0F, -67.0F, -86.0F, 35.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9221F, 0.4542F, 3.0228F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(332, 194).addBox(-1.0F, -52.0F, -103.0F, 35.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6705F, 0.8355F, 2.8748F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(332, 194).addBox(-91.0F, -54.0F, -59.0F, 35.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.1745F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(332, 194).addBox(-79.0F, -57.0F, -2.0F, 61.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(52.0F, -86.0F, -43.0F, 31.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(37.0F, -96.0F, -44.0F, 31.0F, 23.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(53.0F, -86.0F, 21.0F, 31.0F, 12.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(40.0F, -95.0F, 19.0F, 31.0F, 23.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(40.0F, -38.0F, -13.0F, 61.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, -0.7418F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(40.0F, -38.0F, 0.0F, 61.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, -0.7418F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(35.0F, -38.0F, -9.0F, 61.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7418F));
		return LayerDefinition.create(meshdefinition, 512, 512);
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
