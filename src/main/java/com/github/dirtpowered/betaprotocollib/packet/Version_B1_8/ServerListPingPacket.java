package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1ServerListPingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;

public class ServerListPingPacket extends AbstractPacket<V1_8_1ServerListPingPacketData> {

    public ServerListPingPacket() {
        super(0xFE);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1ServerListPingPacketData packet) throws IOException {
        return Unpooled.EMPTY_BUFFER;
    }

    @Override
    public V1_8_1ServerListPingPacketData readPacketData(ByteBuf buffer) throws IOException {
        return new V1_8_1ServerListPingPacketData();
    }
}
