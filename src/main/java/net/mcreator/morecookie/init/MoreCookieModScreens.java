
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morecookie.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.morecookie.client.gui.OneslotScreen;
import net.mcreator.morecookie.client.gui.OnecslotScreen;
import net.mcreator.morecookie.client.gui.NineslotguiScreen;
import net.mcreator.morecookie.client.gui.ElectricguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreCookieModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MoreCookieModMenus.ONESLOT, OneslotScreen::new);
			MenuScreens.register(MoreCookieModMenus.NINESLOTGUI, NineslotguiScreen::new);
			MenuScreens.register(MoreCookieModMenus.ELECTRICGUI, ElectricguiScreen::new);
			MenuScreens.register(MoreCookieModMenus.ONECSLOT, OnecslotScreen::new);
		});
	}
}
