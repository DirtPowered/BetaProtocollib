package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPacket;

public class EntityPacketData extends Packet {

    private int entityId;

    public EntityPacketData(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityId() {
        return entityId;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityPacket.class;
    }
}
