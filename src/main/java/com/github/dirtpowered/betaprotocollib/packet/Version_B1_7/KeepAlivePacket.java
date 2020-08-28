package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3KeepAlivePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;


public class KeepAlivePacket extends AbstractPacket<V1_7_3KeepAlivePacketData> {

    public KeepAlivePacket() {
        super(0x0);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3KeepAlivePacketData packet) {
        return Unpooled.EMPTY_BUFFER;
    }

    @Override
    public V1_7_3KeepAlivePacketData readPacketData(ByteBuf buffer) {
        return new V1_7_3KeepAlivePacketData();
    }
}