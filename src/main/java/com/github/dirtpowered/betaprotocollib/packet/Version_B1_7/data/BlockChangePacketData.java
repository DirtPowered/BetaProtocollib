package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockChangePacket;

public class BlockChangePacketData extends Packet<BlockChangePacket> {

    private int xPosition;
    private int yPosition;
    private int zPosition;
    private int type;
    private int metadata;

    public BlockChangePacketData(int xPosition, int yPosition, int zPosition, int typeId, int metadata) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.zPosition = zPosition;

        this.type = typeId;
        this.metadata = metadata;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getZPosition() {
        return zPosition;
    }

    public int getType() {
        return type;
    }

    public int getMetadata() {
        return metadata;
    }

    @Override
    public Class<BlockChangePacket> getPacketClass() {
        return BlockChangePacket.class;
    }

    @Override
    public String toString() {
        return "BlockChangePacketData{"
                + "xPosition=" + xPosition
                + ", yPosition=" + yPosition
                + ", zPosition=" + zPosition
                + ", type=" + type
                + ", metadata=" + metadata
                + '}';
    }
}
