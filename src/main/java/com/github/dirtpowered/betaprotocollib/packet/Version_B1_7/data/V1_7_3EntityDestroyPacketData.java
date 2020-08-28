package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityDestroyPacket;

public class V1_7_3EntityDestroyPacketData extends Packet<EntityDestroyPacket> {

    private int entityId;

    public V1_7_3EntityDestroyPacketData(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityId() {
        return entityId;
    }

    @Override
    public Class<EntityDestroyPacket> getPacketClass() {
        return EntityDestroyPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3EntityDestroyPacketData{"
                + "entityId=" + entityId
                + '}';
    }
}
