package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3HandshakePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class HandshakePacket extends AbstractPacket<V1_7_3HandshakePacketData> {

    public HandshakePacket() {
        super(0x02);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3HandshakePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getPlayerName(), buffer);
        return buffer;
    }

    @Override
    public V1_7_3HandshakePacketData readPacketData(ByteBuf buffer) {
        String username = readString(buffer, 32);
        return new V1_7_3HandshakePacketData(username);
    }
}