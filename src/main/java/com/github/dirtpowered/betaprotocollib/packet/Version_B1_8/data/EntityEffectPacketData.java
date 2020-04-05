package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.EntityEffectPacket;

public class EntityEffectPacketData extends Packet {
    private int entityId;
    private int effectId;
    private int amplifier;
    private short duration;

    public EntityEffectPacketData(int entityId, int effectId, int amplifier, short duration) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityEffectPacket.class;
    }
}
