package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityActionPacket;

public class V1_7_3EntityActionPacketData extends Packet<EntityActionPacket> {
    private int entityId;
    private int state;

    public V1_7_3EntityActionPacketData(int entityId, int state) {
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
    public Class<EntityActionPacket> getPacketClass() {
        return EntityActionPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3EntityActionPacketData{"
                + "entityId=" + entityId
                + ", state=" + state
                + '}';
    }
}
