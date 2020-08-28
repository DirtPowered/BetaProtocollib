package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SpawnPositionPacket;

public class V1_7_3SpawnPositionPacketData extends Packet<SpawnPositionPacket> {

    private int x;
    private int y;
    private int z;

    public V1_7_3SpawnPositionPacketData(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    @Override
    public Class<SpawnPositionPacket> getPacketClass() {
        return SpawnPositionPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3SpawnPositionPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + '}';
    }
}
