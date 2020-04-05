package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.KeepAlivePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class KeepAlivePacket extends AbstractPacket<KeepAlivePacketData> {

    public KeepAlivePacket() {
        super(0x0);
    }

    @Override
    public ByteBuf writePacketData(KeepAlivePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getId());
        return buffer;
    }

    @Override
    public KeepAlivePacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        return new KeepAlivePacketData(id);
    }
}
