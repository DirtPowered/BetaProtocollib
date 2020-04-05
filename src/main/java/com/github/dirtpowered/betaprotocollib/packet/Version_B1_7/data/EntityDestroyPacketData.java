package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityDestroyPacket;

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
