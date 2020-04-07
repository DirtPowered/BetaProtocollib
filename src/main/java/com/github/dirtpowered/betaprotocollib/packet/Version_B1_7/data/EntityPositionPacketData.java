package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPositionPacket;

public class EntityPositionPacketData extends Packet<EntityPositionPacket> {

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
    public Class<EntityPositionPacket> getPacketClass() {
        return EntityPositionPacket.class;
    }

    @Override
    public String toString() {
        return "EntityPositionPacketData{"
                + "entityId=" + entityId
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + '}';
    }
}
