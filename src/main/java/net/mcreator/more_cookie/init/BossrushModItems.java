
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bossrush.item.XpstaffItem;
import net.mcreator.bossrush.item.SilverSwordItem;
import net.mcreator.bossrush.item.SilverShovelItem;
import net.mcreator.bossrush.item.SilverPickaxeItem;
import net.mcreator.bossrush.item.SilverIngotItem;
import net.mcreator.bossrush.item.SilverHoeItem;
import net.mcreator.bossrush.item.SilverAxeItem;
import net.mcreator.bossrush.item.SilverArmorItem;
import net.mcreator.bossrush.item.SaphirestaffItem;
import net.mcreator.bossrush.item.SaphireSwordItem;
import net.mcreator.bossrush.item.SaphireShovelItem;
import net.mcreator.bossrush.item.SaphirePickaxeItem;
import net.mcreator.bossrush.item.SaphireItem;
import net.mcreator.bossrush.item.SaphireHoeItem;
import net.mcreator.bossrush.item.SaphireAxeItem;
import net.mcreator.bossrush.item.SaphireArmorItem;
import net.mcreator.bossrush.item.RubystaffItem;
import net.mcreator.bossrush.item.RubySwordItem;
import net.mcreator.bossrush.item.RubyShovelItem;
import net.mcreator.bossrush.item.RubyPickaxeItem;
import net.mcreator.bossrush.item.RubyItem;
import net.mcreator.bossrush.item.RubyHoeItem;
import net.mcreator.bossrush.item.RubyAxeItem;
import net.mcreator.bossrush.item.RubyArmorItem;
import net.mcreator.bossrush.item.OrbinitestaffItem;
import net.mcreator.bossrush.item.OrbiniteSwordItem;
import net.mcreator.bossrush.item.OrbiniteShovelItem;
import net.mcreator.bossrush.item.OrbinitePickaxeItem;
import net.mcreator.bossrush.item.OrbiniteIngotItem;
import net.mcreator.bossrush.item.OrbiniteHoeItem;
import net.mcreator.bossrush.item.OrbiniteAxeItem;
import net.mcreator.bossrush.item.OrbiniteArmorItem;
import net.mcreator.bossrush.item.OpalstaffItem;
import net.mcreator.bossrush.item.Opal_toolSwordItem;
import net.mcreator.bossrush.item.Opal_toolShovelItem;
import net.mcreator.bossrush.item.Opal_toolPickaxeItem;
import net.mcreator.bossrush.item.Opal_toolHoeItem;
import net.mcreator.bossrush.item.Opal_toolAxeItem;
import net.mcreator.bossrush.item.Opal_armorArmorItem;
import net.mcreator.bossrush.item.OpalItem;
import net.mcreator.bossrush.item.NewmeteorItem;
import net.mcreator.bossrush.item.NewarrowItem;
import net.mcreator.bossrush.item.NaturespickaxeItem;
import net.mcreator.bossrush.item.ManasteelIngotItem;
import net.mcreator.bossrush.item.ManacrystalItem;
import net.mcreator.bossrush.item.LiquidstartlightItem;
import net.mcreator.bossrush.item.JadestaffItem;
import net.mcreator.bossrush.item.JademasterstaffItem;
import net.mcreator.bossrush.item.JadeSwordItem;
import net.mcreator.bossrush.item.JadeShovelItem;
import net.mcreator.bossrush.item.JadePickaxeItem;
import net.mcreator.bossrush.item.JadeItem;
import net.mcreator.bossrush.item.JadeHoeItem;
import net.mcreator.bossrush.item.JadeAxeItem;
import net.mcreator.bossrush.item.JadeArmorItem;
import net.mcreator.bossrush.item.ForestcoreItem;
import net.mcreator.bossrush.item.FluidmeterItem;
import net.mcreator.bossrush.BossrushMod;

public class BossrushModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BossrushMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(BossrushModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_BLOCK = block(BossrushModBlocks.RUBY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> RUBYSTAFF = REGISTRY.register("rubystaff", () -> new RubystaffItem());
	public static final RegistryObject<Item> MANACRYSTAL = REGISTRY.register("manacrystal", () -> new ManacrystalItem());
	public static final RegistryObject<Item> MANASTEEL_INGOT = REGISTRY.register("manasteel_ingot", () -> new ManasteelIngotItem());
	public static final RegistryObject<Item> MANASTEEL_ORE = block(BossrushModBlocks.MANASTEEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANASTEEL_BLOCK = block(BossrushModBlocks.MANASTEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OPAL = REGISTRY.register("opal", () -> new OpalItem());
	public static final RegistryObject<Item> OPAL_ORE = block(BossrushModBlocks.OPAL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OPAL_BLOCK = block(BossrushModBlocks.OPAL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OPAL_TOOL_PICKAXE = REGISTRY.register("opal_tool_pickaxe", () -> new Opal_toolPickaxeItem());
	public static final RegistryObject<Item> OPAL_TOOL_AXE = REGISTRY.register("opal_tool_axe", () -> new Opal_toolAxeItem());
	public static final RegistryObject<Item> OPAL_TOOL_SWORD = REGISTRY.register("opal_tool_sword", () -> new Opal_toolSwordItem());
	public static final RegistryObject<Item> OPAL_TOOL_SHOVEL = REGISTRY.register("opal_tool_shovel", () -> new Opal_toolShovelItem());
	public static final RegistryObject<Item> OPAL_TOOL_HOE = REGISTRY.register("opal_tool_hoe", () -> new Opal_toolHoeItem());
	public static final RegistryObject<Item> OPALSTAFF = REGISTRY.register("opalstaff", () -> new OpalstaffItem());
	public static final RegistryObject<Item> NEWARROW = REGISTRY.register("newarrow", () -> new NewarrowItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_ORE = block(BossrushModBlocks.SILVER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER_BLOCK = block(BossrushModBlocks.SILVER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SilverPickaxeItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final RegistryObject<Item> SILVER_ARMOR_HELMET = REGISTRY.register("silver_armor_helmet", () -> new SilverArmorItem.Helmet());
	public static final RegistryObject<Item> SILVER_ARMOR_CHESTPLATE = REGISTRY.register("silver_armor_chestplate",
			() -> new SilverArmorItem.Chestplate());
	public static final RegistryObject<Item> SILVER_ARMOR_LEGGINGS = REGISTRY.register("silver_armor_leggings", () -> new SilverArmorItem.Leggings());
	public static final RegistryObject<Item> SILVER_ARMOR_BOOTS = REGISTRY.register("silver_armor_boots", () -> new SilverArmorItem.Boots());
	public static final RegistryObject<Item> LIQUIDSTARTLIGHT_BUCKET = REGISTRY.register("liquidstartlight_bucket", () -> new LiquidstartlightItem());
	public static final RegistryObject<Item> STARLIGHTCOLLECTOR = block(BossrushModBlocks.STARLIGHTCOLLECTOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FLUIDMETER = REGISTRY.register("fluidmeter", () -> new FluidmeterItem());
	public static final RegistryObject<Item> SAPHIRE = REGISTRY.register("saphire", () -> new SaphireItem());
	public static final RegistryObject<Item> SAPHIRE_ORE = block(BossrushModBlocks.SAPHIRE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPHIRE_BLOCK = block(BossrushModBlocks.SAPHIRE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPHIRE_PICKAXE = REGISTRY.register("saphire_pickaxe", () -> new SaphirePickaxeItem());
	public static final RegistryObject<Item> SAPHIRE_AXE = REGISTRY.register("saphire_axe", () -> new SaphireAxeItem());
	public static final RegistryObject<Item> SAPHIRE_SWORD = REGISTRY.register("saphire_sword", () -> new SaphireSwordItem());
	public static final RegistryObject<Item> SAPHIRE_SHOVEL = REGISTRY.register("saphire_shovel", () -> new SaphireShovelItem());
	public static final RegistryObject<Item> SAPHIRE_HOE = REGISTRY.register("saphire_hoe", () -> new SaphireHoeItem());
	public static final RegistryObject<Item> SAPHIRE_ARMOR_HELMET = REGISTRY.register("saphire_armor_helmet", () -> new SaphireArmorItem.Helmet());
	public static final RegistryObject<Item> SAPHIRE_ARMOR_CHESTPLATE = REGISTRY.register("saphire_armor_chestplate",
			() -> new SaphireArmorItem.Chestplate());
	public static final RegistryObject<Item> SAPHIRE_ARMOR_LEGGINGS = REGISTRY.register("saphire_armor_leggings",
			() -> new SaphireArmorItem.Leggings());
	public static final RegistryObject<Item> SAPHIRE_ARMOR_BOOTS = REGISTRY.register("saphire_armor_boots", () -> new SaphireArmorItem.Boots());
	public static final RegistryObject<Item> OPAL_ARMOR_ARMOR_HELMET = REGISTRY.register("opal_armor_armor_helmet",
			() -> new Opal_armorArmorItem.Helmet());
	public static final RegistryObject<Item> OPAL_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("opal_armor_armor_chestplate",
			() -> new Opal_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> OPAL_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("opal_armor_armor_leggings",
			() -> new Opal_armorArmorItem.Leggings());
	public static final RegistryObject<Item> OPAL_ARMOR_ARMOR_BOOTS = REGISTRY.register("opal_armor_armor_boots",
			() -> new Opal_armorArmorItem.Boots());
	public static final RegistryObject<Item> SAPHIRESTAFF = REGISTRY.register("saphirestaff", () -> new SaphirestaffItem());
	public static final RegistryObject<Item> TREEENT = REGISTRY.register("treeent_spawn_egg",
			() -> new ForgeSpawnEggItem(BossrushModEntities.TREEENT, -6985454, -6127853, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> JADE = REGISTRY.register("jade", () -> new JadeItem());
	public static final RegistryObject<Item> JADE_ORE = block(BossrushModBlocks.JADE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JADE_BLOCK = block(BossrushModBlocks.JADE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JADE_PICKAXE = REGISTRY.register("jade_pickaxe", () -> new JadePickaxeItem());
	public static final RegistryObject<Item> JADE_AXE = REGISTRY.register("jade_axe", () -> new JadeAxeItem());
	public static final RegistryObject<Item> JADE_SWORD = REGISTRY.register("jade_sword", () -> new JadeSwordItem());
	public static final RegistryObject<Item> JADE_SHOVEL = REGISTRY.register("jade_shovel", () -> new JadeShovelItem());
	public static final RegistryObject<Item> JADE_HOE = REGISTRY.register("jade_hoe", () -> new JadeHoeItem());
	public static final RegistryObject<Item> JADE_ARMOR_HELMET = REGISTRY.register("jade_armor_helmet", () -> new JadeArmorItem.Helmet());
	public static final RegistryObject<Item> JADE_ARMOR_CHESTPLATE = REGISTRY.register("jade_armor_chestplate", () -> new JadeArmorItem.Chestplate());
	public static final RegistryObject<Item> JADE_ARMOR_LEGGINGS = REGISTRY.register("jade_armor_leggings", () -> new JadeArmorItem.Leggings());
	public static final RegistryObject<Item> JADE_ARMOR_BOOTS = REGISTRY.register("jade_armor_boots", () -> new JadeArmorItem.Boots());
	public static final RegistryObject<Item> FORESTCORE = REGISTRY.register("forestcore", () -> new ForestcoreItem());
	public static final RegistryObject<Item> NATURESPICKAXE = REGISTRY.register("naturespickaxe", () -> new NaturespickaxeItem());
	public static final RegistryObject<Item> ORBINITE_INGOT = REGISTRY.register("orbinite_ingot", () -> new OrbiniteIngotItem());
	public static final RegistryObject<Item> ORBINITE_ORE = block(BossrushModBlocks.ORBINITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ORBINITE_BLOCK = block(BossrushModBlocks.ORBINITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ORBINITE_PICKAXE = REGISTRY.register("orbinite_pickaxe", () -> new OrbinitePickaxeItem());
	public static final RegistryObject<Item> ORBINITE_AXE = REGISTRY.register("orbinite_axe", () -> new OrbiniteAxeItem());
	public static final RegistryObject<Item> ORBINITE_SWORD = REGISTRY.register("orbinite_sword", () -> new OrbiniteSwordItem());
	public static final RegistryObject<Item> ORBINITE_SHOVEL = REGISTRY.register("orbinite_shovel", () -> new OrbiniteShovelItem());
	public static final RegistryObject<Item> ORBINITE_HOE = REGISTRY.register("orbinite_hoe", () -> new OrbiniteHoeItem());
	public static final RegistryObject<Item> ORBINITE_ARMOR_HELMET = REGISTRY.register("orbinite_armor_helmet", () -> new OrbiniteArmorItem.Helmet());
	public static final RegistryObject<Item> ORBINITE_ARMOR_CHESTPLATE = REGISTRY.register("orbinite_armor_chestplate",
			() -> new OrbiniteArmorItem.Chestplate());
	public static final RegistryObject<Item> ORBINITE_ARMOR_LEGGINGS = REGISTRY.register("orbinite_armor_leggings",
			() -> new OrbiniteArmorItem.Leggings());
	public static final RegistryObject<Item> ORBINITE_ARMOR_BOOTS = REGISTRY.register("orbinite_armor_boots", () -> new OrbiniteArmorItem.Boots());
	public static final RegistryObject<Item> SPACEROCK = block(BossrushModBlocks.SPACEROCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JADESTAFF = REGISTRY.register("jadestaff", () -> new JadestaffItem());
	public static final RegistryObject<Item> JADEMASTERSTAFF = REGISTRY.register("jademasterstaff", () -> new JademasterstaffItem());
	public static final RegistryObject<Item> ORBINITESTAFF = REGISTRY.register("orbinitestaff", () -> new OrbinitestaffItem());
	public static final RegistryObject<Item> NEWMETEOR = REGISTRY.register("newmeteor", () -> new NewmeteorItem());
	public static final RegistryObject<Item> XPSTAFF = REGISTRY.register("xpstaff", () -> new XpstaffItem());
	public static final RegistryObject<Item> ORBINITEGOLEM = REGISTRY.register("orbinitegolem_spawn_egg",
			() -> new ForgeSpawnEggItem(BossrushModEntities.ORBINITEGOLEM, -15132391, -14869219,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
