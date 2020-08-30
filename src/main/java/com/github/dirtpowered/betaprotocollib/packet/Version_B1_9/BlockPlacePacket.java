package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data.V1_9BlockPlacePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockPlacePacket extends AbstractPacket<V1_9BlockPlacePacketData> {

    public BlockPlacePacket() {
        super(0x0F);
    }

    @Override
    public ByteBuf writePacketData(V1_9BlockPlacePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getBetaItemStack();

        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getDirection());

        writeItemStack(buffer, item, ItemStackType.ITEM_B1_9);
        return buffer;
    }

    @Override
    public V1_9BlockPlacePacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readByte();
        int z = buffer.readInt();
        int direction = buffer.readByte();

        int itemId = buffer.readShort();

        return new V1_9BlockPlacePacketData(x, y, z, direction, readItemStack(buffer, itemId, ItemStackType.ITEM_B1_9));
    }
}