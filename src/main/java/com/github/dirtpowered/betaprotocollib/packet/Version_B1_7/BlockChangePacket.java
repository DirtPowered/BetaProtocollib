package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3BlockChangePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockChangePacket extends AbstractPacket<V1_7_3BlockChangePacketData> {

    public BlockChangePacket() {
        super(0x35);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3BlockChangePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getXPosition());
        buffer.writeByte(packet.getYPosition());
        buffer.writeInt(packet.getZPosition());
        buffer.writeByte(packet.getType());
        buffer.writeByte(packet.getMetadata());
        return buffer;
    }

    @Override
    public V1_7_3BlockChangePacketData readPacketData(ByteBuf buffer) {
        int xPosition = buffer.readInt();
        int yPosition = buffer.readByte();
        int zPosition = buffer.readInt();
        int type = buffer.readByte();
        int metadata = buffer.readByte();

        return new V1_7_3BlockChangePacketData(xPosition, yPosition, zPosition, type, metadata);
    }
}
