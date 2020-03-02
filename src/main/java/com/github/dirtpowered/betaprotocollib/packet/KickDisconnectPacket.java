package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.KickDisconnectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class KickDisconnectPacket extends AbstractPacket<KickDisconnectPacketData> {

    public KickDisconnectPacket() {
        super(0xFF);
    }

    @Override
    public ByteBuf writePacketData(KickDisconnectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getDisconnectReason(), buffer);
        return buffer;
    }

    public KickDisconnectPacketData readPacketData(ByteBuf buffer) {
        return new KickDisconnectPacketData(readString(buffer, 100));
    }
}
