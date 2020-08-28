package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.EntityHeadLookPacket;

public class V1_2EntityHeadLookPacketData extends Packet<EntityHeadLookPacket> {
    private int entityId;
    private int headYaw;

    public V1_2EntityHeadLookPacketData(int entityId, int headYaw) {
        this.entityId = entityId;
        this.headYaw = headYaw;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getHeadYaw() {
        return headYaw;
    }

    @Override
    public Class<EntityHeadLookPacket> getPacketClass() {
        return EntityHeadLookPacket.class;
    }

    @Override
    public String toString() {
        return "V1_2EntityHeadLookPacketData{"
                + "entityId=" + entityId
                + ", headYaw=" + headYaw
                + '}';
    }
}
