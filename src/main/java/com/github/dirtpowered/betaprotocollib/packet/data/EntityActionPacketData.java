package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityActionPacket;

public class EntityActionPacketData extends Packet {

    private int entityId;
    private int state;

    public EntityActionPacketData(int entityId, int state) {
        this.entityId = entityId;
        this.state = state;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getState() {
        return state;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityActionPacket.class;
    }
}
