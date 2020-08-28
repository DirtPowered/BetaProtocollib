package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3PaintingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PaintingPacket extends AbstractPacket<V1_7_3PaintingPacketData> {

    public PaintingPacket() {
        super(0x19);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3PaintingPacketData packet) {
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
    public V1_7_3PaintingPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        String title = readString(buffer, 13);
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        int direction = buffer.readInt();
        return new V1_7_3PaintingPacketData(entityId, x, y, z, direction, title);
    }
}
