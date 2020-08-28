package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3HandshakePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class HandshakePacket extends AbstractPacket<V1_3HandshakePacketData> {

    public HandshakePacket() {
        super(0x02);
    }

    @Override
    public ByteBuf writePacketData(V1_3HandshakePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getProtocolVersion());
        writeString(packet.getPlayerName(), buffer);
        writeString(packet.getHost(), buffer);
        buffer.writeInt(packet.getPort());
        return buffer;
    }

    @Override
    public V1_3HandshakePacketData readPacketData(ByteBuf buffer) {
        int protocolVersion = buffer.readByte();
        String username = readString(buffer, 16);
        String host = readString(buffer, 255);
        int port = buffer.readInt();
        return new V1_3HandshakePacketData(protocolVersion, username, host, port);
    }
}