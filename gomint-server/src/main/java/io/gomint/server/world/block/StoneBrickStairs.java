package io.gomint.server.world.block;

import io.gomint.world.block.BlockType;

import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 109 )
public class StoneBrickStairs extends Stairs {

    @Override
    public int getBlockId() {
        return 109;
    }

    @Override
    public long getBreakTime() {
        return 2250;
    }

    @Override
    public float getBlastResistance() {
        return 30.0f;
    }

    @Override
    public BlockType getType() {
        return BlockType.STONE_BRICK_STAIRS;
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

}
