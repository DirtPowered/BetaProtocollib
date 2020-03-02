package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.ChatPacket;

public class ChatPacketData extends Packet {

    private String message;

    public ChatPacketData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) ChatPacket.class;
    }
}
