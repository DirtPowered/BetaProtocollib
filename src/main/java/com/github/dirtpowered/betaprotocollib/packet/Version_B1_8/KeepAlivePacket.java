package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1KeepAlivePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class KeepAlivePacket extends AbstractPacket<V1_8_1KeepAlivePacketData> {

    public KeepAlivePacket() {
        super(0x0);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1KeepAlivePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getId());
        return buffer;
    }

    @Override
    public V1_8_1KeepAlivePacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        return new V1_8_1KeepAlivePacketData(id);
    }
}
