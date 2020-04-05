package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.PlayerListItemPacket;

public class PlayerListItemPacketData extends Packet {

    private String username;
    private boolean online;
    private short ping;

    public PlayerListItemPacketData(String username, boolean online, short ping) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PlayerListItemPacket.class;
    }
}
