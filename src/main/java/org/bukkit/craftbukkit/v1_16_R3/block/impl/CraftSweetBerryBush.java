/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_16_R3.block.impl;

public final class CraftSweetBerryBush extends org.bukkit.craftbukkit.v1_16_R3.block.data.CraftBlockData implements org.bukkit.block.data.Ageable {

    public CraftSweetBerryBush() {
        super();
    }

    public CraftSweetBerryBush(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.v1_16_R2.block.data.CraftAgeable

    private static final net.minecraft.state.IntegerProperty AGE = getInteger(net.minecraft.block.SweetBerryBushBlock.class, "age");

    @Override
    public int getAge() {
        return get(AGE);
    }

    @Override
    public void setAge(int age) {
        set(AGE, age);
    }

    @Override
    public int getMaximumAge() {
        return getMax(AGE);
    }
}
