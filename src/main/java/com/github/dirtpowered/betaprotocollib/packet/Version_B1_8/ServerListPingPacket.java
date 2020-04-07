package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.ServerListPingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;

public class ServerListPingPacket extends AbstractPacket<ServerListPingPacketData> {

    public ServerListPingPacket() {
        super(0xFE);
    }

    @Override
    public ByteBuf writePacketData(ServerListPingPacketData packet) throws IOException {
        return Unpooled.EMPTY_BUFFER;
    }

    @Override
    public ServerListPingPacketData readPacketData(ByteBuf buffer) throws IOException {
        return new ServerListPingPacketData();
    }
}
