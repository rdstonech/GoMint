package io.gomint.server.world.block;

import io.gomint.world.block.BlockType;

import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 169 )
public class SeaLantern extends Block implements io.gomint.world.block.BlockSeaLantern {

    @Override
    public int getBlockId() {
        return 169;
    }

    @Override
    public long getBreakTime() {
        return 450;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

    @Override
    public float getBlastResistance() {
        return 1.5f;
    }

    @Override
    public BlockType getType() {
        return BlockType.SEA_LANTERN;
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

}
