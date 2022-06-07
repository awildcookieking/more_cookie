
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.morecookie.entity.StatueEntity;
import net.mcreator.morecookie.entity.ReaperEntity;
import net.mcreator.morecookie.entity.PoseidonEntity;
import net.mcreator.morecookie.entity.HadesEntity;
import net.mcreator.morecookie.entity.CerberusEntity;
import net.mcreator.morecookie.entity.ActualstatueEntity;
import net.mcreator.morecookie.MoreCookieMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreCookieModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MoreCookieMod.MODID);
	public static final RegistryObject<EntityType<StatueEntity>> STATUE = register("statue",
			EntityType.Builder.<StatueEntity>of(StatueEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(StatueEntity::new).fireImmune().sized(5f, 15f));
	public static final RegistryObject<EntityType<ActualstatueEntity>> ACTUALSTATUE = register("actualstatue",
			EntityType.Builder.<ActualstatueEntity>of(ActualstatueEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(ActualstatueEntity::new).fireImmune().sized(2f, 5f));
	public static final RegistryObject<EntityType<HadesEntity>> HADES = register("hades",
			EntityType.Builder.<HadesEntity>of(HadesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HadesEntity::new).fireImmune().sized(5f, 15f));
	public static final RegistryObject<EntityType<CerberusEntity>> CERBERUS = register("cerberus",
			EntityType.Builder.<CerberusEntity>of(CerberusEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CerberusEntity::new).fireImmune().sized(5f, 3f));
	public static final RegistryObject<EntityType<PoseidonEntity>> POSEIDON = register("poseidon",
			EntityType.Builder.<PoseidonEntity>of(PoseidonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PoseidonEntity::new).fireImmune().sized(2.5f, 5f));
	public static final RegistryObject<EntityType<ReaperEntity>> REAPER = register("reaper",
			EntityType.Builder.<ReaperEntity>of(ReaperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(256)
					.setUpdateInterval(3).setCustomClientFactory(ReaperEntity::new).fireImmune().sized(5f, 30f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			StatueEntity.init();
			ActualstatueEntity.init();
			HadesEntity.init();
			CerberusEntity.init();
			PoseidonEntity.init();
			ReaperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STATUE.get(), StatueEntity.createAttributes().build());
		event.put(ACTUALSTATUE.get(), ActualstatueEntity.createAttributes().build());
		event.put(HADES.get(), HadesEntity.createAttributes().build());
		event.put(CERBERUS.get(), CerberusEntity.createAttributes().build());
		event.put(POSEIDON.get(), PoseidonEntity.createAttributes().build());
		event.put(REAPER.get(), ReaperEntity.createAttributes().build());
	}
}
