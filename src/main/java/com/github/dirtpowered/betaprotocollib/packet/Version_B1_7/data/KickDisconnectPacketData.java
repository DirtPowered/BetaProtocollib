package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.KickDisconnectPacket;

public class KickDisconnectPacketData extends Packet<KickDisconnectPacket> {

    private String disconnectReason;

    public KickDisconnectPacketData(String disconnectReason) {
        this.disconnectReason = disconnectReason;
    }

    public String getDisconnectReason() {
        return disconnectReason;
    }

    @Override
    public Class<KickDisconnectPacket> getPacketClass() {
        return KickDisconnectPacket.class;
    }

    @Override
    public String toString() {
        return "KickDisconnectPacketData{"
                + "disconnectReason='" + disconnectReason + '\''
                + '}';
    }
}
