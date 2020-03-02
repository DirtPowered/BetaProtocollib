package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityDestroyPacket;

public class EntityDestroyPacketData extends Packet {

    private int entityId;

    public EntityDestroyPacketData(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityId() {
        return entityId;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityDestroyPacket.class;
    }
}
