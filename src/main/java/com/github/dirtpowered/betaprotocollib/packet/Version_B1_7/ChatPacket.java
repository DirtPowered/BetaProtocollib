package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3ChatPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ChatPacket extends AbstractPacket<V1_7_3ChatPacketData> {

    public ChatPacket() {
        super(0x03);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3ChatPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getMessage(), buffer);
        return buffer;
    }

    @Override
    public V1_7_3ChatPacketData readPacketData(ByteBuf buffer) {
        String message = readString(buffer, 119);
        return new V1_7_3ChatPacketData(message);
    }
}
