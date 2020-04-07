package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.KeepAlivePacket;

public class KeepAlivePacketData extends Packet<KeepAlivePacket> {

    @Override
    public Class<KeepAlivePacket> getPacketClass() {
        return KeepAlivePacket.class;
    }

    @Override
    public String toString() {
        return "KeepAlivePacketData{}";
    }
}
