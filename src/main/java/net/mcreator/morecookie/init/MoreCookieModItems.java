
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.morecookie.item.XpmeterItem;
import net.mcreator.morecookie.item.WoodArmorItem;
import net.mcreator.morecookie.item.WaterorbItem;
import net.mcreator.morecookie.item.VoidcatalistItem;
import net.mcreator.morecookie.item.UraniumtokenItem;
import net.mcreator.morecookie.item.UraniumcellItem;
import net.mcreator.morecookie.item.Uraniumcell2Item;
import net.mcreator.morecookie.item.UraniumIngotItem;
import net.mcreator.morecookie.item.TreetokenItem;
import net.mcreator.morecookie.item.SwordofthunderItem;
import net.mcreator.morecookie.item.SugerchunkItem;
import net.mcreator.morecookie.item.SquarecookieItem;
import net.mcreator.morecookie.item.SplashwaveItem;
import net.mcreator.morecookie.item.SoularmorItem;
import net.mcreator.morecookie.item.SoulOrbItem;
import net.mcreator.morecookie.item.SolartokenItem;
import net.mcreator.morecookie.item.SolarcellItem;
import net.mcreator.morecookie.item.Solarcell4Item;
import net.mcreator.morecookie.item.Solarcell3Item;
import net.mcreator.morecookie.item.Solarcell2Item;
import net.mcreator.morecookie.item.PlasmatokenItem;
import net.mcreator.morecookie.item.PlasmacoreItem;
import net.mcreator.morecookie.item.PlasmacellItem;
import net.mcreator.morecookie.item.Plasmacell2Item;
import net.mcreator.morecookie.item.MiningtokenItem;
import net.mcreator.morecookie.item.MasterpickaxeItem;
import net.mcreator.morecookie.item.MasteraxeItem;
import net.mcreator.morecookie.item.MasterOfThunderItem;
import net.mcreator.morecookie.item.MasterArmorItem;
import net.mcreator.morecookie.item.LightningorbItem;
import net.mcreator.morecookie.item.LabrysItem;
import net.mcreator.morecookie.item.HeattokenItem;
import net.mcreator.morecookie.item.HeatcellItem;
import net.mcreator.morecookie.item.Heatcell2Item;
import net.mcreator.morecookie.item.EnergymeterItem;
import net.mcreator.morecookie.item.ElectricvaporizerItem;
import net.mcreator.morecookie.item.CrimsonArmorItem;
import net.mcreator.morecookie.item.CoinItem;
import net.mcreator.morecookie.item.BatterypackItem;
import net.mcreator.morecookie.item.BatteryItem;
import net.mcreator.morecookie.item.AncientSwordItem;
import net.mcreator.morecookie.item.AncientPickaxeItem;
import net.mcreator.morecookie.item.AncientAxeItem;
import net.mcreator.morecookie.item.AirdItem;
import net.mcreator.morecookie.item.ASwordItem;
import net.mcreator.morecookie.MoreCookieMod;

public class MoreCookieModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreCookieMod.MODID);
	public static final RegistryObject<Item> CRIMSON_ARMOR_HELMET = REGISTRY.register("crimson_armor_helmet", () -> new CrimsonArmorItem.Helmet());
	public static final RegistryObject<Item> CRIMSON_ARMOR_CHESTPLATE = REGISTRY.register("crimson_armor_chestplate",
			() -> new CrimsonArmorItem.Chestplate());
	public static final RegistryObject<Item> CRIMSON_ARMOR_LEGGINGS = REGISTRY.register("crimson_armor_leggings",
			() -> new CrimsonArmorItem.Leggings());
	public static final RegistryObject<Item> CRIMSON_ARMOR_BOOTS = REGISTRY.register("crimson_armor_boots", () -> new CrimsonArmorItem.Boots());
	public static final RegistryObject<Item> A_SWORD = REGISTRY.register("a_sword", () -> new ASwordItem());
	public static final RegistryObject<Item> SQUARECOOKIE = REGISTRY.register("squarecookie", () -> new SquarecookieItem());
	public static final RegistryObject<Item> SUGER = block(MoreCookieModBlocks.SUGER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SUGERCHUNK = REGISTRY.register("sugerchunk", () -> new SugerchunkItem());
	public static final RegistryObject<Item> KELPPACKAGE = block(MoreCookieModBlocks.KELPPACKAGE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANCIENT_PICKAXE = REGISTRY.register("ancient_pickaxe", () -> new AncientPickaxeItem());
	public static final RegistryObject<Item> ANCIENT_AXE = REGISTRY.register("ancient_axe", () -> new AncientAxeItem());
	public static final RegistryObject<Item> ANCIENT_SWORD = REGISTRY.register("ancient_sword", () -> new AncientSwordItem());
	public static final RegistryObject<Item> SWORDOFTHUNDER = REGISTRY.register("swordofthunder", () -> new SwordofthunderItem());
	public static final RegistryObject<Item> XPMETER = REGISTRY.register("xpmeter", () -> new XpmeterItem());
	public static final RegistryObject<Item> AIRD = REGISTRY.register("aird", () -> new AirdItem());
	public static final RegistryObject<Item> OREGENERATOR = block(MoreCookieModBlocks.OREGENERATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TREEGROWER = block(MoreCookieModBlocks.TREEGROWER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOLARCELL = REGISTRY.register("solarcell", () -> new SolarcellItem());
	public static final RegistryObject<Item> SOLARCELL_2 = REGISTRY.register("solarcell_2", () -> new Solarcell2Item());
	public static final RegistryObject<Item> SOLARCELL_3 = REGISTRY.register("solarcell_3", () -> new Solarcell3Item());
	public static final RegistryObject<Item> SOLARCELL_4 = REGISTRY.register("solarcell_4", () -> new Solarcell4Item());
	public static final RegistryObject<Item> PLASMACELL = REGISTRY.register("plasmacell", () -> new PlasmacellItem());
	public static final RegistryObject<Item> PLASMACELL_2 = REGISTRY.register("plasmacell_2", () -> new Plasmacell2Item());
	public static final RegistryObject<Item> URANIUMCELL = REGISTRY.register("uraniumcell", () -> new UraniumcellItem());
	public static final RegistryObject<Item> URANIUMCELL_2 = REGISTRY.register("uraniumcell_2", () -> new Uraniumcell2Item());
	public static final RegistryObject<Item> HEATCELL = REGISTRY.register("heatcell", () -> new HeatcellItem());
	public static final RegistryObject<Item> HEATCELL_2 = REGISTRY.register("heatcell_2", () -> new Heatcell2Item());
	public static final RegistryObject<Item> MASTERPICKAXE = REGISTRY.register("masterpickaxe", () -> new MasterpickaxeItem());
	public static final RegistryObject<Item> URANIUM_INGOT = REGISTRY.register("uranium_ingot", () -> new UraniumIngotItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(MoreCookieModBlocks.URANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URANIUM_BLOCK = block(MoreCookieModBlocks.URANIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOLARPANEL = block(MoreCookieModBlocks.SOLARPANEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TREETOKEN = REGISTRY.register("treetoken", () -> new TreetokenItem());
	public static final RegistryObject<Item> COIN = REGISTRY.register("coin", () -> new CoinItem());
	public static final RegistryObject<Item> MININGTOKEN = REGISTRY.register("miningtoken", () -> new MiningtokenItem());
	public static final RegistryObject<Item> SOLARTOKEN = REGISTRY.register("solartoken", () -> new SolartokenItem());
	public static final RegistryObject<Item> URANIUMTOKEN = REGISTRY.register("uraniumtoken", () -> new UraniumtokenItem());
	public static final RegistryObject<Item> HEATTOKEN = REGISTRY.register("heattoken", () -> new HeattokenItem());
	public static final RegistryObject<Item> PLASMATOKEN = REGISTRY.register("plasmatoken", () -> new PlasmatokenItem());
	public static final RegistryObject<Item> ENERGYMETER = REGISTRY.register("energymeter", () -> new EnergymeterItem());
	public static final RegistryObject<Item> URANIUMGEN = block(MoreCookieModBlocks.URANIUMGEN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HEATGEN = block(MoreCookieModBlocks.HEATGEN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLASMACORE = REGISTRY.register("plasmacore", () -> new PlasmacoreItem());
	public static final RegistryObject<Item> PLASMAGEN = block(MoreCookieModBlocks.PLASMAGEN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WIRE = block(MoreCookieModBlocks.WIRE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> BATTERYPACK = REGISTRY.register("batterypack", () -> new BatterypackItem());
	public static final RegistryObject<Item> ENERGYCONDENSER = block(MoreCookieModBlocks.ENERGYCONDENSER, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STATUE = REGISTRY.register("statue_spawn_egg",
			() -> new ForgeSpawnEggItem(MoreCookieModEntities.STATUE, -14760466, -464851, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ACTUALSTATUE = REGISTRY.register("actualstatue_spawn_egg",
			() -> new ForgeSpawnEggItem(MoreCookieModEntities.ACTUALSTATUE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HADES = REGISTRY.register("hades_spawn_egg",
			() -> new ForgeSpawnEggItem(MoreCookieModEntities.HADES, -2293760, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LABRYS = REGISTRY.register("labrys", () -> new LabrysItem());
	public static final RegistryObject<Item> CERBERUS = REGISTRY.register("cerberus_spawn_egg",
			() -> new ForgeSpawnEggItem(MoreCookieModEntities.CERBERUS, -16777216, -15790321, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LIGHTNINGORB = REGISTRY.register("lightningorb", () -> new LightningorbItem());
	public static final RegistryObject<Item> MASTER_OF_THUNDER = REGISTRY.register("master_of_thunder", () -> new MasterOfThunderItem());
	public static final RegistryObject<Item> SOUL_ORB = REGISTRY.register("soul_orb", () -> new SoulOrbItem());
	public static final RegistryObject<Item> SOULARMOR_HELMET = REGISTRY.register("soularmor_helmet", () -> new SoularmorItem.Helmet());
	public static final RegistryObject<Item> SOULARMOR_CHESTPLATE = REGISTRY.register("soularmor_chestplate", () -> new SoularmorItem.Chestplate());
	public static final RegistryObject<Item> SOULARMOR_LEGGINGS = REGISTRY.register("soularmor_leggings", () -> new SoularmorItem.Leggings());
	public static final RegistryObject<Item> SOULARMOR_BOOTS = REGISTRY.register("soularmor_boots", () -> new SoularmorItem.Boots());
	public static final RegistryObject<Item> POSEIDON = REGISTRY.register("poseidon_spawn_egg",
			() -> new ForgeSpawnEggItem(MoreCookieModEntities.POSEIDON, -15890266, -16248178, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ELECTRICVAPORIZER = REGISTRY.register("electricvaporizer", () -> new ElectricvaporizerItem());
	public static final RegistryObject<Item> MASTERAXE = REGISTRY.register("masteraxe", () -> new MasteraxeItem());
	public static final RegistryObject<Item> MASTER_ARMOR_HELMET = REGISTRY.register("master_armor_helmet", () -> new MasterArmorItem.Helmet());
	public static final RegistryObject<Item> MASTER_ARMOR_CHESTPLATE = REGISTRY.register("master_armor_chestplate",
			() -> new MasterArmorItem.Chestplate());
	public static final RegistryObject<Item> MASTER_ARMOR_LEGGINGS = REGISTRY.register("master_armor_leggings", () -> new MasterArmorItem.Leggings());
	public static final RegistryObject<Item> MASTER_ARMOR_BOOTS = REGISTRY.register("master_armor_boots", () -> new MasterArmorItem.Boots());
	public static final RegistryObject<Item> WATERORB = REGISTRY.register("waterorb", () -> new WaterorbItem());
	public static final RegistryObject<Item> SPLASHWAVE = REGISTRY.register("splashwave", () -> new SplashwaveItem());
	public static final RegistryObject<Item> REAPER = REGISTRY.register("reaper_spawn_egg",
			() -> new ForgeSpawnEggItem(MoreCookieModEntities.REAPER, -16777216, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> VOIDCATALIST = REGISTRY.register("voidcatalist", () -> new VoidcatalistItem());
	public static final RegistryObject<Item> WOOD_ARMOR_HELMET = REGISTRY.register("wood_armor_helmet", () -> new WoodArmorItem.Helmet());
	public static final RegistryObject<Item> WOOD_ARMOR_CHESTPLATE = REGISTRY.register("wood_armor_chestplate", () -> new WoodArmorItem.Chestplate());
	public static final RegistryObject<Item> WOOD_ARMOR_LEGGINGS = REGISTRY.register("wood_armor_leggings", () -> new WoodArmorItem.Leggings());
	public static final RegistryObject<Item> WOOD_ARMOR_BOOTS = REGISTRY.register("wood_armor_boots", () -> new WoodArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
