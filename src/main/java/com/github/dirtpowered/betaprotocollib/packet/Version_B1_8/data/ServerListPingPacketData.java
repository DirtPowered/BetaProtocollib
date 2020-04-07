package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ServerListPingPacket;

public class ServerListPingPacketData extends Packet<ServerListPingPacket> {

    @Override
    public Class<ServerListPingPacket> getPacketClass() {
        return ServerListPingPacket.class;
    }

    @Override
    public String toString() {
        return "ServerListPingPacketData{}";
    }
}
