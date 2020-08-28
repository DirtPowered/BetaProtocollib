package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.EntityEffectPacket;

public class V1_8_1EntityEffectPacketData extends Packet<EntityEffectPacket> {
    private int entityId;
    private int effectId;
    private int amplifier;
    private short duration;

    public V1_8_1EntityEffectPacketData(int entityId, int effectId, int amplifier, short duration) {
        this.entityId = entityId;
        this.effectId = effectId;
        this.amplifier = amplifier;
        this.duration = duration;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getEffectId() {
        return effectId;
    }

    public int getAmplifier() {
        return amplifier;
    }

    public short getDuration() {
        return duration;
    }

    @Override
    public Class<EntityEffectPacket> getPacketClass() {
        return EntityEffectPacket.class;
    }

    @Override
    public String toString() {
        return "V1_8_1EntityEffectPacketData{"
                + "entityId=" + entityId
                + ", effectId=" + effectId
                + ", amplifier=" + amplifier
                + ", duration=" + duration
                + '}';
    }
}
