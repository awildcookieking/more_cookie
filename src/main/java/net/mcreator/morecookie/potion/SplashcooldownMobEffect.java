
package net.mcreator.morecookie.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SplashcooldownMobEffect extends MobEffect {
	public SplashcooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, 16777215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.more_cookie.splashcooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
