
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.morecookie.block.entity.WireBlockEntity;
import net.mcreator.morecookie.block.entity.UraniumgenBlockEntity;
import net.mcreator.morecookie.block.entity.TreegrowerBlockEntity;
import net.mcreator.morecookie.block.entity.SolarpanelBlockEntity;
import net.mcreator.morecookie.block.entity.PlasmagenBlockEntity;
import net.mcreator.morecookie.block.entity.OregeneratorBlockEntity;
import net.mcreator.morecookie.block.entity.HeatgenBlockEntity;
import net.mcreator.morecookie.block.entity.EnergycondenserBlockEntity;
import net.mcreator.morecookie.MoreCookieMod;

public class MoreCookieModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MoreCookieMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OREGENERATOR = register("oregenerator", MoreCookieModBlocks.OREGENERATOR,
			OregeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TREEGROWER = register("treegrower", MoreCookieModBlocks.TREEGROWER,
			TreegrowerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLARPANEL = register("solarpanel", MoreCookieModBlocks.SOLARPANEL,
			SolarpanelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> URANIUMGEN = register("uraniumgen", MoreCookieModBlocks.URANIUMGEN,
			UraniumgenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HEATGEN = register("heatgen", MoreCookieModBlocks.HEATGEN, HeatgenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLASMAGEN = register("plasmagen", MoreCookieModBlocks.PLASMAGEN,
			PlasmagenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WIRE = register("wire", MoreCookieModBlocks.WIRE, WireBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENERGYCONDENSER = register("energycondenser", MoreCookieModBlocks.ENERGYCONDENSER,
			EnergycondenserBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
