package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.HandshakePacket;

public class HandshakePacketData extends Packet {

    private final String playerName;

    public HandshakePacketData(final String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) HandshakePacket.class;
    }
}
