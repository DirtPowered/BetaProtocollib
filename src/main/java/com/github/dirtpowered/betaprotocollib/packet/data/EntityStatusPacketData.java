package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityStatusPacket;

public class EntityStatusPacketData extends Packet {

    private int entityId;
    private int status;

    public EntityStatusPacketData(int entityId, int status) {
        this.entityId = entityId;
        this.status = status;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityStatusPacket.class;
    }
}
