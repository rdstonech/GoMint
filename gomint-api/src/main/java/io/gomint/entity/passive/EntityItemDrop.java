package io.gomint.entity.passive;

import io.gomint.GoMint;
import io.gomint.entity.Entity;
import io.gomint.entity.active.EntityPrimedTNT;
import io.gomint.inventory.item.ItemStack;

import java.util.concurrent.TimeUnit;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface EntityItemDrop extends Entity {

    /**
     * Create a new EntityItemDrop without any configuration. It will use default values when not configured and spawned
     *
     * @return new entity
     */
    static EntityItemDrop create() {
        return GoMint.instance().createEntity( EntityItemDrop.class );
    }

    /**
     * Get the ItemStack which has been stored in this entity. You can modify it but it won't update
     * the entity.
     *
     * @param <T> generic type of the item stack
     * @return the ItemStack which has been stored
     */
    <T extends ItemStack> T getItemStack();

    /**
     * Item stack which should be used by this entity. This will silenty fail when the entity is already spawned
     *
     * @param itemStack which should be used in this entity
     */
    void setItemStack( ItemStack itemStack );

    /**
     * Set a new pickup delay
     *
     * @param duration the amount of timeUnit to wait
     * @param timeUnit the unit of time to wait
     */
    void setPickupDelay( long duration, TimeUnit timeUnit );

    /**
     * Get the time when the item drop is allowed to be picked up
     *
     * @return the unix timestamp in millis when the item drop can be picked up
     */
    long getPickupTime();

}
