package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3KickDisconnectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class KickDisconnectPacket extends AbstractPacket<V1_7_3KickDisconnectPacketData> {

    public KickDisconnectPacket() {
        super(0xFF);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3KickDisconnectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getDisconnectReason(), buffer);
        return buffer;
    }

    public V1_7_3KickDisconnectPacketData readPacketData(ByteBuf buffer) {
        return new V1_7_3KickDisconnectPacketData(readString(buffer, 100));
    }
}
