package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data.V1_4ServerListPingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ServerListPingPacket extends AbstractPacket<V1_4ServerListPingPacketData> {

    public ServerListPingPacket() {
        super(0xFE);
    }

    @Override
    public ByteBuf writePacketData(V1_4ServerListPingPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(1);
        return buffer;
    }

    @Override
    public V1_4ServerListPingPacketData readPacketData(ByteBuf buffer) {
        buffer.readByte();
        return new V1_4ServerListPingPacketData();
    }
}
