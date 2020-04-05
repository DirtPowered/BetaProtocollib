package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RemoveEntityEffectPacket;

public class RemoveEntityEffectPacketData extends Packet {
    private int entityId;
    private int effectId;

    public RemoveEntityEffectPacketData(int entityId, int effectId) {
        this.entityId = entityId;
        this.effectId = effectId;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getEffectId() {
        return effectId;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) RemoveEntityEffectPacket.class;
    }
}
