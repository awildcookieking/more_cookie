
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bossrush.init;

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

import net.mcreator.bossrush.entity.TreeentEntity;
import net.mcreator.bossrush.entity.OrbinitegolemEntity;
import net.mcreator.bossrush.entity.NewmeteorEntity;
import net.mcreator.bossrush.entity.NewarrowEntity;
import net.mcreator.bossrush.BossrushMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BossrushModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BossrushMod.MODID);
	public static final RegistryObject<EntityType<NewarrowEntity>> NEWARROW = register("projectile_newarrow",
			EntityType.Builder.<NewarrowEntity>of(NewarrowEntity::new, MobCategory.MISC).setCustomClientFactory(NewarrowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TreeentEntity>> TREEENT = register("treeent",
			EntityType.Builder.<TreeentEntity>of(TreeentEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(TreeentEntity::new)

					.sized(2.5f, 8f));
	public static final RegistryObject<EntityType<NewmeteorEntity>> NEWMETEOR = register("projectile_newmeteor",
			EntityType.Builder.<NewmeteorEntity>of(NewmeteorEntity::new, MobCategory.MISC).setCustomClientFactory(NewmeteorEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OrbinitegolemEntity>> ORBINITEGOLEM = register("orbinitegolem",
			EntityType.Builder.<OrbinitegolemEntity>of(OrbinitegolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(OrbinitegolemEntity::new).fireImmune().sized(0.4f, 0.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TreeentEntity.init();
			OrbinitegolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TREEENT.get(), TreeentEntity.createAttributes().build());
		event.put(ORBINITEGOLEM.get(), OrbinitegolemEntity.createAttributes().build());
	}
}
