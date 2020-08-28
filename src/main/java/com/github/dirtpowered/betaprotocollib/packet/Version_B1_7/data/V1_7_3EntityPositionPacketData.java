package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPositionPacket;

public class V1_7_3EntityPositionPacketData extends Packet<EntityPositionPacket> {

    private int entityId;
    private int x;
    private int y;
    private int z;

    public V1_7_3EntityPositionPacketData(int entityId, int x, int y, int z) {
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
        return "V1_7_3EntityPositionPacketData{"
                + "entityId=" + entityId
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + '}';
    }
}
