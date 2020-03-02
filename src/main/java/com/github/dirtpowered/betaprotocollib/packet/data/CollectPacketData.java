package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.CollectPacket;

public class CollectPacketData extends Packet {

    private int entityId;
    private int targetEntityId;

    public CollectPacketData(int entityId, int targetEntityId) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) CollectPacket.class;
    }
}
