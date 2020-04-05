package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.FlyingPacket;

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
