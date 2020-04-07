package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.FlyingPacket;

public class FlyingPacketData extends Packet<FlyingPacket> {

    private boolean onGround;

    public FlyingPacketData(boolean onGround) {
        this.onGround = onGround;
    }

    public boolean isOnGround() {
        return onGround;
    }

    @Override
    public Class<FlyingPacket> getPacketClass() {
        return FlyingPacket.class;
    }

    @Override
    public String toString() {
        return "FlyingPacketData{"
                + "onGround=" + onGround
                + '}';
    }
}
