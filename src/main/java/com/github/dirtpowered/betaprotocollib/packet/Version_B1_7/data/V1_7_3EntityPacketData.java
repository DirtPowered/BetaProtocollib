package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPacket;

public class V1_7_3EntityPacketData extends Packet<EntityPacket> {

    private int entityId;

    public V1_7_3EntityPacketData(int entityId) {
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
        return "V1_7_3EntityPacketData{"
                + "entityId=" + entityId
                + '}';
    }
}
