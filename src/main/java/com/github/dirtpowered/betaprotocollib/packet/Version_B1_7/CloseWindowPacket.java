package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3CloseWindowPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CloseWindowPacket extends AbstractPacket<V1_7_3CloseWindowPacketData> {

    public CloseWindowPacket() {
        super(0x65);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3CloseWindowPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        return buffer;
    }

    @Override
    public V1_7_3CloseWindowPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        return new V1_7_3CloseWindowPacketData(windowId);
    }
}
