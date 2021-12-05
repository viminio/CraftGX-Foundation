package io.izzel.arclight.common.mod.util.types;

import net.minecraft.world.effect.MobEffect;
import org.bukkit.craftbukkit.v.potion.CraftPotionEffectType;

public class ArclightPotionEffect extends CraftPotionEffectType {

    private final String name;

    public ArclightPotionEffect(MobEffect handle, String name) {
        super(handle);
        this.name = name;
    }

    @Override
    public String getName() {
        String name = super.getName();
        if (name.startsWith("UNKNOWN_EFFECT_TYPE_")) {
            return this.name;
        } else {
            return name;
        }
    }
}
