
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.morecookie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MoreCookieModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(Items.REDSTONE, 15),
					new ItemStack(MoreCookieModItems.CRIMSON_ARMOR_HELMET.get()), 10, 100, 1f));
			trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(Items.REDSTONE, 15),
					new ItemStack(MoreCookieModItems.CRIMSON_ARMOR_CHESTPLATE.get()), 10, 100, 1f));
			trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(Items.REDSTONE, 15),
					new ItemStack(MoreCookieModItems.CRIMSON_ARMOR_LEGGINGS.get()), 10, 100, 1f));
			trades.get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(Items.REDSTONE, 15),
					new ItemStack(MoreCookieModItems.CRIMSON_ARMOR_BOOTS.get()), 10, 100, 1f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(Blocks.END_STONE, 64),
					new ItemStack(MoreCookieModItems.A_SWORD.get()), 10, 100, 1f));
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 5), new ItemStack(Items.COOKIE, 5),
					new ItemStack(MoreCookieModItems.SQUARECOOKIE.get()), 10, 100, 1f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 2), new ItemStack(Items.SUGAR, 64),
					new ItemStack(MoreCookieModBlocks.SUGER.get()), 100, 5, 0.05f));
			trades.get(3).add(new BasicItemListing(new ItemStack(Items.SUGAR, 3), new ItemStack(Items.EMERALD), new ItemStack(Items.BONE_MEAL, 3),
					100, 5, 0.05f));
			trades.get(2).add(new BasicItemListing(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Items.BONE_MEAL, 10),
					new ItemStack(Blocks.WHEAT, 64), 10, 5, 1f));
			trades.get(4).add(new BasicItemListing(new ItemStack(Blocks.POPPY), new ItemStack(Blocks.EMERALD_BLOCK, 32),
					new ItemStack(Blocks.WITHER_ROSE), 10, 10000, 0.05f));
			trades.get(5).add(new BasicItemListing(new ItemStack(Items.COAL), new ItemStack(Items.BONE_MEAL, 32), new ItemStack(Blocks.COAL_BLOCK),
					10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			trades.get(3).add(new BasicItemListing(new ItemStack(MoreCookieModBlocks.KELPPACKAGE.get()), new ItemStack(Items.COD),
					new ItemStack(Items.COOKED_COD, 16), 10, 5, 0.05f));
			trades.get(5).add(new BasicItemListing(new ItemStack(MoreCookieModBlocks.KELPPACKAGE.get(), 5), new ItemStack(Items.NAUTILUS_SHELL, 5),
					new ItemStack(Items.HEART_OF_THE_SEA), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(MoreCookieModBlocks.KELPPACKAGE.get()),

					new ItemStack(Blocks.EMERALD_BLOCK), 10, 5, 0.05f));
			trades.get(5).add(new BasicItemListing(new ItemStack(MoreCookieModBlocks.KELPPACKAGE.get()),

					new ItemStack(Blocks.EMERALD_BLOCK, 3), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 3),

					new ItemStack(MoreCookieModBlocks.KELPPACKAGE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 10),

					new ItemStack(MoreCookieModItems.ANCIENT_PICKAXE.get()), 10, 5, 0.05f));
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 10),

					new ItemStack(MoreCookieModItems.ANCIENT_AXE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 20), new ItemStack(Blocks.DRAGON_HEAD),
					new ItemStack(MoreCookieModItems.ANCIENT_SWORD.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_SAPLING), new ItemStack(MoreCookieModItems.COIN.get(), 3),
					new ItemStack(MoreCookieModItems.TREETOKEN.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.STONE_PICKAXE), new ItemStack(MoreCookieModItems.COIN.get(), 3),
					new ItemStack(MoreCookieModItems.MININGTOKEN.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.LAPIS_BLOCK), new ItemStack(MoreCookieModItems.COIN.get(), 3),
					new ItemStack(MoreCookieModItems.SOLARTOKEN.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.REDSTONE_BLOCK), new ItemStack(MoreCookieModItems.COIN.get(), 3),
					new ItemStack(MoreCookieModItems.HEATTOKEN.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.IRON_BLOCK), new ItemStack(MoreCookieModItems.COIN.get(), 3),
					new ItemStack(MoreCookieModItems.URANIUMTOKEN.get()), 10, 5, 0.05f));
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.OBSIDIAN), new ItemStack(MoreCookieModItems.COIN.get(), 3),
					new ItemStack(MoreCookieModItems.PLASMATOKEN.get()), 10, 5, 0.05f));
		}
	}
}
