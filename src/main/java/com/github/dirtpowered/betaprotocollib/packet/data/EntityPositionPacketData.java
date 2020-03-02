package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityPositionPacket;

public class EntityPositionPacketData extends Packet {

    private int entityId;
    private int x;
    private int y;
    private int z;

    public EntityPositionPacketData(int entityId, int x, int y, int z) {
        this.entityId = entityId;
        this.x = x;
        this.y = y;
        this.z = z;
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

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityPositionPacket.class;
    }
}
