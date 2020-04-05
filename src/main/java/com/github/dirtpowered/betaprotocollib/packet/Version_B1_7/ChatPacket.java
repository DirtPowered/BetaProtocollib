package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.ChatPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ChatPacket extends AbstractPacket<ChatPacketData> {

    public ChatPacket() {
        super(0x03);
    }

    @Override
    public ByteBuf writePacketData(ChatPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getMessage(), buffer);
        return buffer;
    }

    @Override
    public ChatPacketData readPacketData(ByteBuf buffer) {
        String message = readString(buffer, 119);
        return new ChatPacketData(message);
    }
}
