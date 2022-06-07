
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.morecookie.potion.SplashcooldownMobEffect;
import net.mcreator.morecookie.potion.AxecooldownMobEffect;
import net.mcreator.morecookie.MoreCookieMod;

public class MoreCookieModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MoreCookieMod.MODID);
	public static final RegistryObject<MobEffect> AXECOOLDOWN = REGISTRY.register("axecooldown", () -> new AxecooldownMobEffect());
	public static final RegistryObject<MobEffect> SPLASHCOOLDOWN = REGISTRY.register("splashcooldown", () -> new SplashcooldownMobEffect());
}
