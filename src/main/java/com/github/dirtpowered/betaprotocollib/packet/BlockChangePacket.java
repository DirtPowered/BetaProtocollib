package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.BlockChangePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockChangePacket extends AbstractPacket<BlockChangePacketData> {

    public BlockChangePacket() {
        super(0x35);
    }

    @Override
    public ByteBuf writePacketData(BlockChangePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getXPosition());
        buffer.writeByte(packet.getYPosition());
        buffer.writeInt(packet.getZPosition());
        buffer.writeByte(packet.getType());
        buffer.writeByte(packet.getMetadata());
        return buffer;
    }

    @Override
    public BlockChangePacketData readPacketData(ByteBuf buffer) {
        int xPosition = buffer.readInt();
        int yPosition = buffer.readByte();
        int zPosition = buffer.readInt();
        int type = buffer.readByte();
        int metadata = buffer.readByte();

        return new BlockChangePacketData(xPosition, yPosition, zPosition, type, metadata);
    }
}
