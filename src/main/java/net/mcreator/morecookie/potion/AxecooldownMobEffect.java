
package net.mcreator.morecookie.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AxecooldownMobEffect extends MobEffect {
	public AxecooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, 16777215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.more_cookie.axecooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
