package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityMoveLookPacket;

public class EntityMoveLookPacketData extends Packet<EntityMoveLookPacket> {

    private int entityId;
    private int x;
    private int y;
    private int z;
    private int yaw;
    private int pitch;

    public EntityMoveLookPacketData(int entityId, int x, int y, int z, int yaw, int pitch) {
        this.entityId = entityId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
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

    public int getYaw() {
        return yaw;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public Class<EntityMoveLookPacket> getPacketClass() {
        return EntityMoveLookPacket.class;
    }

    @Override
    public String toString() {
        return "EntityMoveLookPacketData{"
                + "entityId=" + entityId
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", yaw=" + yaw
                + ", pitch=" + pitch
                + '}';
    }
}
