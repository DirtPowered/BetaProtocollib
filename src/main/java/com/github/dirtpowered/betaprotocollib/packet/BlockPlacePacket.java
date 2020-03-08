package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.BlockPlacePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockPlacePacket extends AbstractPacket<BlockPlacePacketData> {

    public BlockPlacePacket() {
        super(0x0F);
    }

    @Override
    public ByteBuf writePacketData(BlockPlacePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getDirection());

        if (packet.getItemStack() == null) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(packet.getItemStack().getBlockId());
            buffer.writeByte(packet.getItemStack().getAmount());
            buffer.writeShort(packet.getItemStack().getData());
        }
        return buffer;
    }

    @Override
    public BlockPlacePacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readByte();
        int z = buffer.readInt();
        int direction = buffer.readByte();

        BetaItemStack itemStack = null;
        int itemId = buffer.readShort();

        if (itemId >= 0) {
            int stackSize = buffer.readByte();
            int itemData = buffer.readShort();
            itemStack = new BetaItemStack(itemId, stackSize, itemData);
        }

        return new BlockPlacePacketData(x, y, z, direction, itemStack);
    }
}
