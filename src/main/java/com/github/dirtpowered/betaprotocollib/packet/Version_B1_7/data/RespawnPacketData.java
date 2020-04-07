package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.RespawnPacket;

public class RespawnPacketData extends Packet<RespawnPacket> {

    private byte dimension;

    public RespawnPacketData(byte dimension) {
        this.dimension = dimension;
    }

    public byte getDimension() {
        return dimension;
    }

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }

    @Override
    public String toString() {
        return "RespawnPacketData{"
                + "dimension=" + dimension
                + '}';
    }
}
