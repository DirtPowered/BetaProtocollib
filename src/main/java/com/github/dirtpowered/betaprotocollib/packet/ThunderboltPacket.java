package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.ThunderboltPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ThunderboltPacket extends AbstractPacket<ThunderboltPacketData> {

    public ThunderboltPacket() {
        super(0x47);
    }

    @Override
    public ByteBuf writePacketData(ThunderboltPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getLighting());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        return buffer;
    }

    @Override
    public ThunderboltPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int lighting = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();

        return new ThunderboltPacketData(entityId, x, y, z, lighting);
    }
}
