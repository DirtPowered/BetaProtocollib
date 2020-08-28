package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.BlockActionPacket;

public class V1_3BlockActionPacketData extends Packet<BlockActionPacket> {
    private int x;
    private int y;
    private int z;
    private int actionType;
    private int pitch;
    private int blockId;

    public V1_3BlockActionPacketData(int x, int y, int z, int actionType, int pitch, int blockId) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.actionType = actionType;
        this.pitch = pitch;
        this.blockId = blockId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getActionType() {
        return actionType;
    }

    public int getBlockId() {
        return blockId;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public Class<BlockActionPacket> getPacketClass() {
        return BlockActionPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3BlockActionPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", actionType=" + actionType
                + ", pitch=" + pitch
                + ", blockId=" + blockId
                + '}';
    }
}
