package io.gomint.server.world.block;

import io.gomint.inventory.item.*;
import io.gomint.server.registry.RegisterInfo;
import io.gomint.world.block.BlockType;
import io.gomint.world.block.data.BlockColor;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 159 )
public class StainedHardenedClay extends Block implements io.gomint.world.block.BlockStainedHardenedClay {

    @Override
    public int getBlockId() {
        return 159;
    }

    @Override
    public long getBreakTime() {
        return 1875;
    }

    @Override
    public Class<? extends ItemStack>[] getToolInterfaces() {
        return new Class[]{
            ItemWoodenPickaxe.class,
            ItemIronPickaxe.class,
            ItemDiamondPickaxe.class,
            ItemGoldenPickaxe.class,
            ItemStonePickaxe.class
        };
    }

    @Override
    public float getBlastResistance() {
        return 0.75f;
    }

    @Override
    public BlockType getType() {
        return BlockType.STAINED_HARDENED_CLAY;
    }

    @Override
    public BlockColor getColor() {
        switch ( this.getBlockData() ) {
            case 0:
                return BlockColor.WHITE;
            case 1:
                return BlockColor.ORANGE;
            case 2:
                return BlockColor.MAGENTA;
            case 3:
                return BlockColor.LIGHT_BLUE;
            case 4:
                return BlockColor.YELLOW;
            case 5:
                return BlockColor.LIME;
            case 6:
                return BlockColor.PINK;
            case 7:
                return BlockColor.GRAY;
            case 8:
                return BlockColor.LIGHT_GRAY;
            case 9:
                return BlockColor.CYAN;
            case 10:
                return BlockColor.PURPLE;
            case 11:
                return BlockColor.BLUE;
            case 12:
                return BlockColor.BROWN;
            case 13:
                return BlockColor.GREEN;
            case 14:
                return BlockColor.RED;
            default:
                return BlockColor.BLACK;

        }
    }

    @Override
    public void setColor( BlockColor color ) {
        switch ( color ) {
            case WHITE:
                this.setBlockData( (byte) 0 );
                break;
            case ORANGE:
                this.setBlockData( (byte) 1 );
                break;
            case MAGENTA:
                this.setBlockData( (byte) 2 );
                break;
            case LIGHT_BLUE:
                this.setBlockData( (byte) 3 );
                break;
            case YELLOW:
                this.setBlockData( (byte) 4 );
                break;
            case LIME:
                this.setBlockData( (byte) 5 );
                break;
            case PINK:
                this.setBlockData( (byte) 6 );
                break;
            case GRAY:
                this.setBlockData( (byte) 7 );
                break;
            case LIGHT_GRAY:
                this.setBlockData( (byte) 8 );
                break;
            case CYAN:
                this.setBlockData( (byte) 9 );
                break;
            case PURPLE:
                this.setBlockData( (byte) 10 );
                break;
            case BLUE:
                this.setBlockData( (byte) 11 );
                break;
            case BROWN:
                this.setBlockData( (byte) 12 );
                break;
            case GREEN:
                this.setBlockData( (byte) 13 );
                break;
            case RED:
                this.setBlockData( (byte) 14 );
                break;
            default:
            case BLACK:
                this.setBlockData( (byte) 15 );
        }

        this.updateBlock();
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }
}
