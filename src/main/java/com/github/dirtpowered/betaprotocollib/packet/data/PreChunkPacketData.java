package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.PreChunkPacket;

public class PreChunkPacketData extends Packet {
    private int x;
    private int z;
    private boolean full;

    public PreChunkPacketData(int x, int z, boolean full) {
        this.x = x;
        this.z = z;
        this.full = full;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public boolean isFull() {
        return full;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PreChunkPacket.class;
    }
}
