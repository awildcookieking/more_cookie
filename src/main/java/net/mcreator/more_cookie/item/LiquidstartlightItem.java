
package net.mcreator.bossrush.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.bossrush.init.BossrushModFluids;

public class LiquidstartlightItem extends BucketItem {
	public LiquidstartlightItem() {
		super(BossrushModFluids.LIQUIDSTARTLIGHT,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
