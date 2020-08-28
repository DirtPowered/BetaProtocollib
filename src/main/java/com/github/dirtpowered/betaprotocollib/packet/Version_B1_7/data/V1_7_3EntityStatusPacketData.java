package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityStatusPacket;

public class V1_7_3EntityStatusPacketData extends Packet<EntityStatusPacket> {

    private int entityId;
    private int status;

    public V1_7_3EntityStatusPacketData(int entityId, int status) {
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
    public Class<EntityStatusPacket> getPacketClass() {
        return EntityStatusPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3EntityStatusPacketData{"
                + "entityId=" + entityId
                + ", status=" + status
                + '}';
    }
}
