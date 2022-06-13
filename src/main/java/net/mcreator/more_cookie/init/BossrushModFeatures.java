
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

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

import net.mcreator.bossrush.world.features.ores.SpacerockFeature;
import net.mcreator.bossrush.world.features.ores.SilverOreFeature;
import net.mcreator.bossrush.world.features.ores.SaphireOreFeature;
import net.mcreator.bossrush.world.features.ores.RubyOreFeature;
import net.mcreator.bossrush.world.features.ores.OpalOreFeature;
import net.mcreator.bossrush.world.features.ores.ManasteelOreFeature;
import net.mcreator.bossrush.world.features.ores.JadeOreFeature;
import net.mcreator.bossrush.world.features.TreenetspawnFeature;
import net.mcreator.bossrush.world.features.SmallmeteorFeature;
import net.mcreator.bossrush.world.features.MeteorFeature;
import net.mcreator.bossrush.BossrushMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class BossrushModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BossrushMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MANASTEEL_ORE = register("manasteel_ore", ManasteelOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ManasteelOreFeature.GENERATE_BIOMES, ManasteelOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OPAL_ORE = register("opal_ore", OpalOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OpalOreFeature.GENERATE_BIOMES, OpalOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAPHIRE_ORE = register("saphire_ore", SaphireOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SaphireOreFeature.GENERATE_BIOMES, SaphireOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JADE_ORE = register("jade_ore", JadeOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, JadeOreFeature.GENERATE_BIOMES, JadeOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPACEROCK = register("spacerock", SpacerockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SpacerockFeature.GENERATE_BIOMES, SpacerockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLMETEOR = register("smallmeteor", SmallmeteorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, SmallmeteorFeature.GENERATE_BIOMES, SmallmeteorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> METEOR = register("meteor", MeteorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, MeteorFeature.GENERATE_BIOMES, MeteorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TREENETSPAWN = register("treenetspawn", TreenetspawnFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, TreenetspawnFeature.GENERATE_BIOMES, TreenetspawnFeature::placedFeature));

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
