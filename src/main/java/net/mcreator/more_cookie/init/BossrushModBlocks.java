
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bossrush.block.StarlightcollectorBlock;
import net.mcreator.bossrush.block.SpacerockBlock;
import net.mcreator.bossrush.block.SilverOreBlock;
import net.mcreator.bossrush.block.SilverBlockBlock;
import net.mcreator.bossrush.block.SaphireOreBlock;
import net.mcreator.bossrush.block.SaphireBlockBlock;
import net.mcreator.bossrush.block.RubyOreBlock;
import net.mcreator.bossrush.block.RubyBlockBlock;
import net.mcreator.bossrush.block.OrbiniteOreBlock;
import net.mcreator.bossrush.block.OrbiniteBlockBlock;
import net.mcreator.bossrush.block.OpalOreBlock;
import net.mcreator.bossrush.block.OpalBlockBlock;
import net.mcreator.bossrush.block.ManasteelOreBlock;
import net.mcreator.bossrush.block.ManasteelBlockBlock;
import net.mcreator.bossrush.block.LiquidstartlightBlock;
import net.mcreator.bossrush.block.JadeOreBlock;
import net.mcreator.bossrush.block.JadeBlockBlock;
import net.mcreator.bossrush.BossrushMod;

public class BossrushModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BossrushMod.MODID);
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> MANASTEEL_ORE = REGISTRY.register("manasteel_ore", () -> new ManasteelOreBlock());
	public static final RegistryObject<Block> MANASTEEL_BLOCK = REGISTRY.register("manasteel_block", () -> new ManasteelBlockBlock());
	public static final RegistryObject<Block> OPAL_ORE = REGISTRY.register("opal_ore", () -> new OpalOreBlock());
	public static final RegistryObject<Block> OPAL_BLOCK = REGISTRY.register("opal_block", () -> new OpalBlockBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> LIQUIDSTARTLIGHT = REGISTRY.register("liquidstartlight", () -> new LiquidstartlightBlock());
	public static final RegistryObject<Block> STARLIGHTCOLLECTOR = REGISTRY.register("starlightcollector", () -> new StarlightcollectorBlock());
	public static final RegistryObject<Block> SAPHIRE_ORE = REGISTRY.register("saphire_ore", () -> new SaphireOreBlock());
	public static final RegistryObject<Block> SAPHIRE_BLOCK = REGISTRY.register("saphire_block", () -> new SaphireBlockBlock());
	public static final RegistryObject<Block> JADE_ORE = REGISTRY.register("jade_ore", () -> new JadeOreBlock());
	public static final RegistryObject<Block> JADE_BLOCK = REGISTRY.register("jade_block", () -> new JadeBlockBlock());
	public static final RegistryObject<Block> ORBINITE_ORE = REGISTRY.register("orbinite_ore", () -> new OrbiniteOreBlock());
	public static final RegistryObject<Block> ORBINITE_BLOCK = REGISTRY.register("orbinite_block", () -> new OrbiniteBlockBlock());
	public static final RegistryObject<Block> SPACEROCK = REGISTRY.register("spacerock", () -> new SpacerockBlock());
}
