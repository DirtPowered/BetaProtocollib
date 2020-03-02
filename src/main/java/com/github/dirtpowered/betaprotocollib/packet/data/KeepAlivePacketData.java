package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.KeepAlivePacket;

public class KeepAlivePacketData extends Packet {

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) KeepAlivePacket.class;
    }
}
