package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.ThunderboltPacket;

public class ThunderboltPacketData extends Packet {

    private int entityId;
    private int x;
    private int y;
    private int z;
    private int lighting;

    public ThunderboltPacketData(int entityId, int x, int y, int z, int lighting) {
        this.entityId = entityId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.lighting = lighting;
    }

    public int getEntityId() {
        return entityId;
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

    public int getLighting() {
        return lighting;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) ThunderboltPacket.class;
    }
}
