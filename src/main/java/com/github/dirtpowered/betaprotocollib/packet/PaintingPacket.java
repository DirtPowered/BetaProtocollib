package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.PaintingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PaintingPacket extends AbstractPacket<PaintingPacketData> {

    public PaintingPacket() {
        super(0x19);
    }

    @Override
    public ByteBuf writePacketData(PaintingPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getTitle(), buffer);
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeInt(packet.getDirection());

        return buffer;
    }

    @Override
    public PaintingPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        String title = readString(buffer, 13);
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        int direction = buffer.readInt();
        return new PaintingPacketData(entityId, x, y, z, direction, title);
    }
}
