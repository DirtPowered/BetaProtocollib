package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.KickDisconnectPacket;

public class KickDisconnectPacketData extends Packet {

    private String disconnectReason;

    public KickDisconnectPacketData(String disconnectReason) {
        this.disconnectReason = disconnectReason;
    }

    public String getDisconnectReason() {
        return disconnectReason;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) KickDisconnectPacket.class;
    }
}
