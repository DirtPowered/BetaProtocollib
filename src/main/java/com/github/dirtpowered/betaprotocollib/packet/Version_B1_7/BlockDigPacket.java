package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3BlockDigPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockDigPacket extends AbstractPacket<V1_7_3BlockDigPacketData> {

    public BlockDigPacket() {
        super(0x0E);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3BlockDigPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getStatus());
        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getFace());
        return buffer;
    }

    @Override
    public V1_7_3BlockDigPacketData readPacketData(ByteBuf buffer) {
        int status = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readByte();
        int z = buffer.readInt();
        int face = buffer.readByte();

        return new V1_7_3BlockDigPacketData(x, y, z, face, status);
    }
}
