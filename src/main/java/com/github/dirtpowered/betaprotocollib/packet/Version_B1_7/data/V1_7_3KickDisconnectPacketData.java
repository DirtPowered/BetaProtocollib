package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.KickDisconnectPacket;

public class V1_7_3KickDisconnectPacketData extends Packet<KickDisconnectPacket> {

    private String disconnectReason;

    public V1_7_3KickDisconnectPacketData(String disconnectReason) {
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
        return "V1_7_3KickDisconnectPacketData{"
                + "disconnectReason='" + disconnectReason + '\''
                + '}';
    }
}
