
package net.mcreator.bossrush.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.bossrush.procedures.BurnActiveTickConditionProcedure;

public class BurnMobEffect extends MobEffect {
	public BurnMobEffect() {
		super(MobEffectCategory.HARMFUL, -2986496);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bossrush.burn";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BurnActiveTickConditionProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
