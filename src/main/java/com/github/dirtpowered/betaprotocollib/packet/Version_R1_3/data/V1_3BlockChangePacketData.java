package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.BlockChangePacket;

public class V1_3BlockChangePacketData extends Packet<BlockChangePacket> {

    private int xPosition;
    private int yPosition;
    private int zPosition;
    private int type;
    private int metadata;

    public V1_3BlockChangePacketData(int xPosition, int yPosition, int zPosition, int typeId, int metadata) {
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
        return "V1_3BlockChangePacketData{"
                + "xPosition=" + xPosition
                + ", yPosition=" + yPosition
                + ", zPosition=" + zPosition
                + ", type=" + type
                + ", metadata=" + metadata
                + '}';
    }
}
