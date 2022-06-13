
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.bossrush.potion.ExahustMobEffect;
import net.mcreator.bossrush.potion.BurnMobEffect;
import net.mcreator.bossrush.BossrushMod;

public class BossrushModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BossrushMod.MODID);
	public static final RegistryObject<MobEffect> BURN = REGISTRY.register("burn", () -> new BurnMobEffect());
	public static final RegistryObject<MobEffect> EXAHUST = REGISTRY.register("exahust", () -> new ExahustMobEffect());
}
