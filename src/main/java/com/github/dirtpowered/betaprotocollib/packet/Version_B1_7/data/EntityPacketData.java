package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPacket;

public class EntityPacketData extends Packet<EntityPacket> {

    private int entityId;

    public EntityPacketData(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityId() {
        return entityId;
    }

    @Override
    public Class<EntityPacket> getPacketClass() {
        return EntityPacket.class;
    }

    @Override
    public String toString() {
        return "EntityPacketData{"
                + "entityId=" + entityId
                + '}';
    }
}
