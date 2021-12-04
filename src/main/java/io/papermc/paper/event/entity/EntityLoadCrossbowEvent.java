package io.papermc.paper.event.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a LivingEntity loads a crossbow with a projectile.
 */
public class EntityLoadCrossbowEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final ItemStack crossbow;
    private final EquipmentSlot hand;
    private boolean cancelled;
    private boolean consumeItem = true;

    public EntityLoadCrossbowEvent(@NotNull LivingEntity entity, @Nullable ItemStack crossbow, @NotNull EquipmentSlot hand) {
        super(entity);
        this.crossbow = crossbow;
        this.hand = hand;
    }

    @NotNull
    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) entity;
    }

    /**
     * Gets the crossbow {@link ItemStack} being loaded.
     *
     * @return the crossbow involved in this event
     */
    @Nullable
    public ItemStack getCrossbow() {
        return crossbow;
    }

    /**
     * Gets the hand from which the crossbow was loaded.
     *
     * @return the hand
     */
    @NotNull
    public EquipmentSlot getHand() {
        return hand;
    }

    /**
     *
     * @return should the itemstack be consumed
     */
    public boolean shouldConsumeItem() {
        return consumeItem;
    }

    /**
     *
     * @param consume should the item be consumed
     */
    public void setConsumeItem(boolean consume) {
        this.consumeItem = consume;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Set whether or not to cancel the crossbow being loaded. If canceled, the
     * projectile that would be loaded into the crossbow will not be consumed.
     *
     * If set to false, and this event is pertaining to a player entity,
     * it's recommended that a call to {@link Player#updateInventory()} is made
     * as the client may think the server still loaded an item into the crossbow.
     *
     * @param cancel true if you wish to cancel this event
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
