package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AnimationPacket;

public class AnimationPacketData extends Packet {

    private int entityId;
    private int animate;

    public AnimationPacketData(int entityId, int animate) {
        this.entityId = entityId;
        this.animate = animate;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getAnimate() {
        return animate;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) AnimationPacket.class;
    }
}
