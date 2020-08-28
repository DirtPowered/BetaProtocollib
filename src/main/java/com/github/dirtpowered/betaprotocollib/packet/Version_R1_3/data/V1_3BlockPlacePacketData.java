package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.BlockPlacePacket;

public class V1_3BlockPlacePacketData extends Packet<BlockPlacePacket> {
    private int x;
    private int y;
    private int z;
    private int direction;
    private BetaItemStack betaItemStack;
    private float xOffset;
    private float yOffset;
    private float zOffset;

    public V1_3BlockPlacePacketData(int x, int y, int z, int direction, BetaItemStack itemStack,
                                    float xOffset, float yOffset, float zOffset) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
        this.betaItemStack = itemStack;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.zOffset = zOffset;
    }

    public BetaItemStack getItemStack() {
        return betaItemStack;
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

    public int getDirection() {
        return direction;
    }

    public float getXOffset() {
        return xOffset;
    }

    public float getYOffset() {
        return yOffset;
    }

    public float getZOffset() {
        return zOffset;
    }

    @Override
    public Class<BlockPlacePacket> getPacketClass() {
        return BlockPlacePacket.class;
    }

    @Override
    public String toString() {
        return "V1_3BlockPlacePacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", direction=" + direction
                + ", betaItemStack=" + betaItemStack
                + ", xOffset=" + xOffset
                + ", yOffset=" + yOffset
                + ", zOffset=" + zOffset
                + '}';
    }
}
