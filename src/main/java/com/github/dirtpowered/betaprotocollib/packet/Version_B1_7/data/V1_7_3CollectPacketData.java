package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CollectPacket;

public class V1_7_3CollectPacketData extends Packet<CollectPacket> {

    private int entityId;
    private int targetEntityId;

    public V1_7_3CollectPacketData(int entityId, int targetEntityId) {
        this.entityId = entityId;
        this.targetEntityId = targetEntityId;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getTargetEntityId() {
        return targetEntityId;
    }

    @Override
    public Class<CollectPacket> getPacketClass() {
        return CollectPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3CollectPacketData{"
                + "entityId=" + entityId
                + ", targetEntityId=" + targetEntityId
                + '}';
    }
}
