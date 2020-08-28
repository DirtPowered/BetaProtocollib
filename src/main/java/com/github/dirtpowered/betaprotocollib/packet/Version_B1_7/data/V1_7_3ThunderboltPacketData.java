package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ThunderboltPacket;

public class V1_7_3ThunderboltPacketData extends Packet<ThunderboltPacket> {

    private int entityId;
    private int x;
    private int y;
    private int z;
    private int lighting;

    public V1_7_3ThunderboltPacketData(int entityId, int x, int y, int z, int lighting) {
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
    public Class<ThunderboltPacket> getPacketClass() {
        return ThunderboltPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3ThunderboltPacketData{"
                + "entityId=" + entityId
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", lighting=" + lighting
                + '}';
    }
}
