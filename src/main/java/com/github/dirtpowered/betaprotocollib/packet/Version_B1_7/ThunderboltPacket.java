package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3ThunderboltPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ThunderboltPacket extends AbstractPacket<V1_7_3ThunderboltPacketData> {

    public ThunderboltPacket() {
        super(0x47);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3ThunderboltPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getLighting());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        return buffer;
    }

    @Override
    public V1_7_3ThunderboltPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int lighting = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();

        return new V1_7_3ThunderboltPacketData(entityId, x, y, z, lighting);
    }
}
