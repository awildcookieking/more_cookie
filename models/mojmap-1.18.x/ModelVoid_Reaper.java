// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVoid_Reaper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "void_reaper"), "main");
	private final ModelPart bb_main;

	public ModelVoid_Reaper(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-52.0F, -101.0F, -49.0F, 92.0F, 74.0F, 90.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-45.0F, -176.0F, -41.0F, 79.0F, 98.0F, 74.0F, new CubeDeformation(0.0F)).texOffs(653, 303)
				.addBox(-35.0F, -246.0F, -36.0F, 62.0F, 80.0F, 66.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-35.0F, -246.0F, -21.0F, 62.0F, 4.0F, 66.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-27.0F, -246.0F, -12.0F, 47.0F, 4.0F, 66.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-60.0F, -44.0F, -53.0F, 107.0F, 44.0F, 105.0F, new CubeDeformation(0.0F)).texOffs(969, 59)
				.addBox(68.0F, -101.0F, -11.0F, 50.0F, 27.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(522, 906)
				.addBox(87.0F, -267.0F, -8.0F, 29.0F, 20.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(1306, 973)
				.addBox(91.0F, -48.0F, -7.0F, 22.0F, 9.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(1306, 973)
				.addBox(91.0F, -26.0F, -7.0F, 22.0F, 9.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(1319, 1095)
				.addBox(91.0F, -228.0F, -7.0F, 22.0F, 9.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(766, 1256)
						.addBox(133.0F, -272.0F, 5.0F, 22.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1002, 1117)
						.addBox(75.0F, -286.0F, 5.0F, 57.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(766, 1256)
						.addBox(156.0F, -309.0F, 5.0F, 22.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1002, 1117)
						.addBox(183.0F, -309.0F, 5.0F, 57.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(1002, 1117)
						.addBox(193.0F, -330.0F, 5.0F, 20.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1002, 1117)
						.addBox(156.0F, -334.0F, 5.0F, 57.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild(
				"cube_r4", CubeListBuilder.create().texOffs(1002, 1117).addBox(146.0F, -283.0F, 5.0F, 57.0F, 20.0F,
						6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild(
				"cube_r5", CubeListBuilder.create().texOffs(1002, 1117).addBox(121.0F, -304.0F, 5.0F, 57.0F, 18.0F,
						6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(880, 637)
						.addBox(-282.0F, -107.0F, 0.0F, 279.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-245.0F, 33.0F, -27.0F, 62.0F, 4.0F, 66.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-245.0F, -28.0F, -23.0F, 62.0F, 4.0F, 63.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild(
				"cube_r7", CubeListBuilder.create().texOffs(969, 59).addBox(-121.0F, -130.0F, -11.0F, 107.0F, 27.0F,
						30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition cube_r8 = bb_main
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -248.0F, 34.0F, 21.0F, 4.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bb_main
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(969, 59).addBox(9.0F, -137.0F, -11.0F, 107.0F, 27.0F, 30.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		return LayerDefinition.create(meshdefinition, 1500, 1500);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}