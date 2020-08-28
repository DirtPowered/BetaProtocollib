package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data.V_1_1CustomPayloadPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CustomPayloadPacket extends AbstractPacket<V_1_1CustomPayloadPacketData> {

    public CustomPayloadPacket() {
        super(0xFA);
    }

    @Override
    public ByteBuf writePacketData(V_1_1CustomPayloadPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getChannel(), buffer);
        buffer.writeShort(packet.getSize());
        buffer.writeBytes(packet.getData());
        return buffer;
    }

    @Override
    public V_1_1CustomPayloadPacketData readPacketData(ByteBuf buffer) {
        String channel = readString(buffer, 16);
        int size = buffer.readShort();
        byte[] data = new byte[0];

        if (size > 0 && size < 32767) {
            data = new byte[size];
            buffer.readBytes(data);
        }

        return new V_1_1CustomPayloadPacketData(channel, size, data);
    }
}
