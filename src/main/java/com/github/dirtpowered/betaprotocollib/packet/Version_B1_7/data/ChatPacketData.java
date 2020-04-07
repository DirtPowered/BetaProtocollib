package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ChatPacket;

public class ChatPacketData extends Packet<ChatPacket> {

    private String message;

    public ChatPacketData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public Class<ChatPacket> getPacketClass() {
        return ChatPacket.class;
    }

    @Override
    public String toString() {
        return "ChatPacketData{"
                + "message='" + message + '\''
                + '}';
    }
}
