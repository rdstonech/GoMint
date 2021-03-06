/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.event.inventory;

import io.gomint.entity.EntityPlayer;
import io.gomint.event.player.CancellablePlayerEvent;
import io.gomint.inventory.transaction.Transaction;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author geNAZt
 * @version 1.0
 */
@EqualsAndHashCode( callSuper = true )
@ToString( callSuper = true )
public class InventoryTransactionEvent extends CancellablePlayerEvent {

    private final List<Transaction> transactions;

    /**
     * Create a transaction event to control inventory movements
     *
     * @param player       which has executed this transaction
     * @param transactions which should be executed
     */
    public InventoryTransactionEvent( EntityPlayer player, List<Transaction> transactions ) {
        super( player );
        this.transactions = transactions;
    }

    /**
     * Get the transactions which should be executed
     *
     * @return transactions which may be applied
     */
    public List<Transaction> getTransactions() {
        return this.transactions;
    }

}
