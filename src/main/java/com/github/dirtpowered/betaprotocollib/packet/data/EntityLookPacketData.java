package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityLookPacket;

public class EntityLookPacketData extends Packet {

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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityLookPacket.class;
    }
}
