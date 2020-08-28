package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.FlyingPacket;

public class V1_7_3FlyingPacketData extends Packet<FlyingPacket> {

    private boolean onGround;

    public V1_7_3FlyingPacketData(boolean onGround) {
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
        return "V1_7_3FlyingPacketData{"
                + "onGround=" + onGround
                + '}';
    }
}
