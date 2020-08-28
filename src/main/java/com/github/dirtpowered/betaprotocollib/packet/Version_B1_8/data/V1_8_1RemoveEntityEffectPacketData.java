package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RemoveEntityEffectPacket;

public class V1_8_1RemoveEntityEffectPacketData extends Packet<RemoveEntityEffectPacket> {
    private int entityId;
    private int effectId;

    public V1_8_1RemoveEntityEffectPacketData(int entityId, int effectId) {
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
    public Class<RemoveEntityEffectPacket> getPacketClass() {
        return RemoveEntityEffectPacket.class;
    }

    @Override
    public String toString() {
        return "V1_8_1RemoveEntityEffectPacketData{"
                + "entityId=" + entityId
                + ", effectId=" + effectId
                + '}';
    }
}
