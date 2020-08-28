package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.HandshakePacket;

public class V1_3HandshakePacketData extends Packet<HandshakePacket> {
    private int protocolVersion;
    private String playerName;
    private String host;
    private int port;

    public V1_3HandshakePacketData(int protocolVersion, String playerName, String host, int port) {
        this.protocolVersion = protocolVersion;
        this.playerName = playerName;
        this.host = host;
        this.port = port;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getProtocolVersion() {
        return protocolVersion;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    @Override
    public Class<HandshakePacket> getPacketClass() {
        return HandshakePacket.class;
    }

    @Override
    public String toString() {
        return "V1_3HandshakePacketData{"
                + "protocolVersion=" + protocolVersion
                + ", playerName='" + playerName + '\''
                + ", host='" + host + '\''
                + ", port=" + port
                + '}';
    }
}
