package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityStatusPacket;

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
