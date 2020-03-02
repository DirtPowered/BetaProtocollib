package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.KeepAlivePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class KeepAlivePacket extends AbstractPacket<KeepAlivePacketData> {

    public KeepAlivePacket() {
        super(0x0);
    }

    @Override
    public ByteBuf writePacketData(KeepAlivePacketData packet) {
        return Unpooled.EMPTY_BUFFER;
    }

    @Override
    public KeepAlivePacketData readPacketData(ByteBuf buffer) {
        return new KeepAlivePacketData();
    }
}
