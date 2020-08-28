package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.KeepAlivePacket;

public class V1_8_1KeepAlivePacketData extends Packet<KeepAlivePacket> {
    private int id;

    public V1_8_1KeepAlivePacketData(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public Class<KeepAlivePacket> getPacketClass() {
        return KeepAlivePacket.class;
    }

    @Override
    public String toString() {
        return "V1_8_1KeepAlivePacketData{"
                + "id=" + id
                + '}';
    }
}
