package io.gomint.server.world.block;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.world.block.BlockType;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 70 )
public class StonePressurePlate extends BasePressurePlate implements io.gomint.world.block.BlockStonePressurePlate {

    @Override
    public int getBlockId() {
        return 70;
    }

    @Override
    public long getBreakTime() {
        return 750;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

    @Override
    public boolean isSolid() {
        return false;
    }

    @Override
    public float getBlastResistance() {
        return 2.5f;
    }

    @Override
    public BlockType getType() {
        return BlockType.STONE_PRESSURE_PLATE;
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

}
