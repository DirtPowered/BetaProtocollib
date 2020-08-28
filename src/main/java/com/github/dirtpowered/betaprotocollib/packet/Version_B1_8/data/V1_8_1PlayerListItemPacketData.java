package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.PlayerListItemPacket;

public class V1_8_1PlayerListItemPacketData extends Packet<PlayerListItemPacket> {

    private String username;
    private boolean online;
    private short ping;

    public V1_8_1PlayerListItemPacketData(String username, boolean online, short ping) {
        this.username = username;
        this.online = online;
        this.ping = ping;
    }

    public String getUsername() {
        return username;
    }

    public boolean isOnline() {
        return online;
    }

    public short getPing() {
        return ping;
    }

    @Override
    public Class<PlayerListItemPacket> getPacketClass() {
        return PlayerListItemPacket.class;
    }

    @Override
    public String toString() {
        return "V1_8_1PlayerListItemPacketData{"
                + "username='" + username + '\''
                + ", online=" + online
                + ", ping=" + ping
                + '}';
    }
}
