/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.morecookie;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.morecookie.init.MoreCookieModMobEffects;
import net.mcreator.morecookie.init.MoreCookieModItems;
import net.mcreator.morecookie.init.MoreCookieModFeatures;
import net.mcreator.morecookie.init.MoreCookieModEntities;
import net.mcreator.morecookie.init.MoreCookieModBlocks;
import net.mcreator.morecookie.init.MoreCookieModBlockEntities;
import net.mcreator.morecookie.init.MoreCookieModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("more_cookie")
public class MoreCookieMod {
	public static final Logger LOGGER = LogManager.getLogger(MoreCookieMod.class);
	public static final String MODID = "more_cookie";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public MoreCookieMod() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MoreCookieModBlocks.REGISTRY.register(bus);
		MoreCookieModItems.REGISTRY.register(bus);
		MoreCookieModEntities.REGISTRY.register(bus);
		MoreCookieModBlockEntities.REGISTRY.register(bus);
		MoreCookieModFeatures.REGISTRY.register(bus);

		MoreCookieModMobEffects.REGISTRY.register(bus);

		MoreCookieModBiomes.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
