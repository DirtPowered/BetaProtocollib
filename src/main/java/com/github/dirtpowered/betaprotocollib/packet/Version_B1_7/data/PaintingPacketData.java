package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PaintingPacket;

public class PaintingPacketData extends Packet {

    private int entityId;
    private int x;
    private int y;
    private int z;
    private int direction;
    private String title;

    public PaintingPacketData(int entityId, int x, int y, int z, int direction, String title) {
        this.entityId = entityId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
        this.title = title;
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

    public int getDirection() {
        return direction;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PaintingPacket.class;
    }
}
