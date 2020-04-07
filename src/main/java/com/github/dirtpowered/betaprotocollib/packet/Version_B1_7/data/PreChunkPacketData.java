package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PreChunkPacket;

public class PreChunkPacketData extends Packet<PreChunkPacket> {
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
    public Class<PreChunkPacket> getPacketClass() {
        return PreChunkPacket.class;
    }

    @Override
    public String toString() {
        return "PreChunkPacketData{"
                + "x=" + x
                + ", z=" + z
                + ", full=" + full
                + '}';
    }
}
