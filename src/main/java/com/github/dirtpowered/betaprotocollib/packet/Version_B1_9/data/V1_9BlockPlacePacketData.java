package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.BlockPlacePacket;

public class V1_9BlockPlacePacketData extends Packet<BlockPlacePacket> {
    private int x;
    private int y;
    private int z;
    private int direction;
    private BetaItemStack betaItemStack;

    public V1_9BlockPlacePacketData(int x, int y, int z, int direction, BetaItemStack itemStack) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
        this.betaItemStack = itemStack;
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

    @Override
    public Class<BlockPlacePacket> getPacketClass() {
        return BlockPlacePacket.class;
    }

    @Override
    public String toString() {
        return "V1_9BlockPlacePacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", direction=" + direction
                + ", betaItemStack=" + betaItemStack
                + '}';
    }
}
