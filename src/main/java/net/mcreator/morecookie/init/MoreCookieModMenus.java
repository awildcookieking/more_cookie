
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.morecookie.world.inventory.OneslotMenu;
import net.mcreator.morecookie.world.inventory.OnecslotMenu;
import net.mcreator.morecookie.world.inventory.NineslotguiMenu;
import net.mcreator.morecookie.world.inventory.ElectricguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreCookieModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<OneslotMenu> ONESLOT = register("oneslot", (id, inv, extraData) -> new OneslotMenu(id, inv, extraData));
	public static final MenuType<NineslotguiMenu> NINESLOTGUI = register("nineslotgui",
			(id, inv, extraData) -> new NineslotguiMenu(id, inv, extraData));
	public static final MenuType<ElectricguiMenu> ELECTRICGUI = register("electricgui",
			(id, inv, extraData) -> new ElectricguiMenu(id, inv, extraData));
	public static final MenuType<OnecslotMenu> ONECSLOT = register("onecslot", (id, inv, extraData) -> new OnecslotMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
