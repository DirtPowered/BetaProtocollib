package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.BlockPlacePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockPlacePacket extends AbstractPacket<BlockPlacePacketData> {

    public BlockPlacePacket() {
        super(0x0F);
    }

    @Override
    public ByteBuf writePacketData(BlockPlacePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getItemStack();

        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getDirection());

        writeItemStack(buffer, item);
        return buffer;
    }

    @Override
    public BlockPlacePacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readByte();
        int z = buffer.readInt();
        int direction = buffer.readByte();

        int itemId = buffer.readShort();

        return new BlockPlacePacketData(x, y, z, direction, readItemStack(buffer, itemId));
    }
}