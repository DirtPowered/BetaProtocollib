package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.KeepAlivePacket;

public class KeepAlivePacketData extends Packet {
    private int id;

    public KeepAlivePacketData(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) KeepAlivePacket.class;
    }
}
