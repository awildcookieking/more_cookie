
package net.mcreator.bossrush.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ExahustMobEffect extends MobEffect {
	public ExahustMobEffect() {
		super(MobEffectCategory.HARMFUL, -14203962);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bossrush.exahust";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
