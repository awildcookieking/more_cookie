
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.morecookie.block.WireBlock;
import net.mcreator.morecookie.block.UraniumgenBlock;
import net.mcreator.morecookie.block.UraniumOreBlock;
import net.mcreator.morecookie.block.UraniumBlockBlock;
import net.mcreator.morecookie.block.TreegrowerBlock;
import net.mcreator.morecookie.block.SugerBlock;
import net.mcreator.morecookie.block.SolarpanelBlock;
import net.mcreator.morecookie.block.RacepadBlock;
import net.mcreator.morecookie.block.PlasmagenBlock;
import net.mcreator.morecookie.block.OregeneratorBlock;
import net.mcreator.morecookie.block.KelppackageBlock;
import net.mcreator.morecookie.block.HeatgenBlock;
import net.mcreator.morecookie.block.EnergycondenserBlock;
import net.mcreator.morecookie.block.BoostpadBlock;
import net.mcreator.morecookie.block.AirdPortalBlock;
import net.mcreator.morecookie.MoreCookieMod;

public class MoreCookieModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreCookieMod.MODID);
	public static final RegistryObject<Block> SUGER = REGISTRY.register("suger", () -> new SugerBlock());
	public static final RegistryObject<Block> KELPPACKAGE = REGISTRY.register("kelppackage", () -> new KelppackageBlock());
	public static final RegistryObject<Block> AIRD_PORTAL = REGISTRY.register("aird_portal", () -> new AirdPortalBlock());
	public static final RegistryObject<Block> OREGENERATOR = REGISTRY.register("oregenerator", () -> new OregeneratorBlock());
	public static final RegistryObject<Block> TREEGROWER = REGISTRY.register("treegrower", () -> new TreegrowerBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> SOLARPANEL = REGISTRY.register("solarpanel", () -> new SolarpanelBlock());
	public static final RegistryObject<Block> URANIUMGEN = REGISTRY.register("uraniumgen", () -> new UraniumgenBlock());
	public static final RegistryObject<Block> HEATGEN = REGISTRY.register("heatgen", () -> new HeatgenBlock());
	public static final RegistryObject<Block> PLASMAGEN = REGISTRY.register("plasmagen", () -> new PlasmagenBlock());
	public static final RegistryObject<Block> WIRE = REGISTRY.register("wire", () -> new WireBlock());
	public static final RegistryObject<Block> ENERGYCONDENSER = REGISTRY.register("energycondenser", () -> new EnergycondenserBlock());
	public static final RegistryObject<Block> BOOSTPAD = REGISTRY.register("boostpad", () -> new BoostpadBlock());
	public static final RegistryObject<Block> RACEPAD = REGISTRY.register("racepad", () -> new RacepadBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SugerBlock.registerRenderLayer();
		}
	}
}
