package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityActionPacket;

public class EntityActionPacketData extends Packet<EntityActionPacket> {

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
    public Class<EntityActionPacket> getPacketClass() {
        return EntityActionPacket.class;
    }

    @Override
    public String toString() {
        return "EntityActionPacketData{"
                + "entityId=" + entityId
                + ", state=" + state
                + '}';
    }
}
