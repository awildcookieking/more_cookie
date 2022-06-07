
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.morecookie.world.features.plants.SugerFeature;
import net.mcreator.morecookie.world.features.ZeusarenaFeature;
import net.mcreator.morecookie.world.features.WaterarenaFeature;
import net.mcreator.morecookie.world.features.S1Feature;
import net.mcreator.morecookie.world.features.Pp1Feature;
import net.mcreator.morecookie.world.features.P3Feature;
import net.mcreator.morecookie.world.features.P2Feature;
import net.mcreator.morecookie.world.features.P1Feature;
import net.mcreator.morecookie.world.features.O2Feature;
import net.mcreator.morecookie.world.features.O1Feature;
import net.mcreator.morecookie.world.features.I5Feature;
import net.mcreator.morecookie.world.features.I4Feature;
import net.mcreator.morecookie.world.features.I3Feature;
import net.mcreator.morecookie.world.features.I2Feature;
import net.mcreator.morecookie.world.features.I1Feature;
import net.mcreator.morecookie.world.features.FirearenaFeature;
import net.mcreator.morecookie.MoreCookieMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MoreCookieModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MoreCookieMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> SUGER = register("suger", SugerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SugerFeature.GENERATE_BIOMES, SugerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> I_1 = register("i_1", I1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, I1Feature.GENERATE_BIOMES, I1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> I_2 = register("i_2", I2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, I2Feature.GENERATE_BIOMES, I2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> I_3 = register("i_3", I3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, I3Feature.GENERATE_BIOMES, I3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> I_4 = register("i_4", I4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, I4Feature.GENERATE_BIOMES, I4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> P_1 = register("p_1", P1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, P1Feature.GENERATE_BIOMES, P1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> P_2 = register("p_2", P2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, P2Feature.GENERATE_BIOMES, P2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> P_3 = register("p_3", P3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, P3Feature.GENERATE_BIOMES, P3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> S_1 = register("s_1", S1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, S1Feature.GENERATE_BIOMES, S1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> I_5 = register("i_5", I5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, I5Feature.GENERATE_BIOMES, I5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> O_1 = register("o_1", O1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, O1Feature.GENERATE_BIOMES, O1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PP_1 = register("pp_1", Pp1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Pp1Feature.GENERATE_BIOMES, Pp1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> O_2 = register("o_2", O2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, O2Feature.GENERATE_BIOMES, O2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ZEUSARENA = register("zeusarena", ZeusarenaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, ZeusarenaFeature.GENERATE_BIOMES, ZeusarenaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FIREARENA = register("firearena", FirearenaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, FirearenaFeature.GENERATE_BIOMES, FirearenaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WATERARENA = register("waterarena", WaterarenaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, WaterarenaFeature.GENERATE_BIOMES, WaterarenaFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
