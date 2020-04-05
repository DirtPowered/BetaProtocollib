package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.HandshakePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class HandshakePacket extends AbstractPacket<HandshakePacketData> {

    public HandshakePacket() {
        super(0x02);
    }

    @Override
    public ByteBuf writePacketData(HandshakePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getPlayerName(), buffer);
        return buffer;
    }

    @Override
    public HandshakePacketData readPacketData(ByteBuf buffer) {
        String username = readString(buffer, 32);
        return new HandshakePacketData(username);
    }
}