package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.FlyingPacket;

public class FlyingPacketData extends Packet {

    private boolean onGround;

    public FlyingPacketData(boolean onGround) {
        this.onGround = onGround;
    }

    public boolean isOnGround() {
        return onGround;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) FlyingPacket.class;
    }
}
