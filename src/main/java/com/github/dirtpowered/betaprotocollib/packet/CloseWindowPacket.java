package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.CloseWindowPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CloseWindowPacket extends AbstractPacket<CloseWindowPacketData> {

    public CloseWindowPacket() {
        super(0x65);
    }

    @Override
    public ByteBuf writePacketData(CloseWindowPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        return buffer;
    }

    @Override
    public CloseWindowPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        return new CloseWindowPacketData(windowId);
    }
}
