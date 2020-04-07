package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityLookPacket;

public class EntityLookPacketData extends Packet<EntityLookPacket> {

    private int entityId;
    private int yaw;
    private int pitch;

    public EntityLookPacketData(int entityId, int yaw, int pitch) {
        this.entityId = entityId;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getYaw() {
        return yaw;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public Class<EntityLookPacket> getPacketClass() {
        return EntityLookPacket.class;
    }

    @Override
    public String toString() {
        return "EntityLookPacketData{"
                + "entityId=" + entityId
                + ", yaw=" + yaw
                + ", pitch=" + pitch
                + '}';
    }
}
