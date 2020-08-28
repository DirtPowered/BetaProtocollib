package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3BlockPlacePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockPlacePacket extends AbstractPacket<V1_3BlockPlacePacketData> {

    public BlockPlacePacket() {
        super(0x0F);
    }

    @Override
    public ByteBuf writePacketData(V1_3BlockPlacePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getItemStack();

        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getDirection());

        writeItemStack(buffer, item, ItemStackType.ITEM_R1_3);

        buffer.writeByte((int) (packet.getXOffset() * 16.0F));
        buffer.writeByte((int) (packet.getYOffset() * 16.0F));
        buffer.writeByte((int) (packet.getZOffset() * 16.0F));
        return buffer;
    }

    @Override
    public V1_3BlockPlacePacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readByte();
        int z = buffer.readInt();
        int direction = buffer.readByte();

        int itemId = buffer.readShort();

        BetaItemStack itemStack = readItemStack(buffer, itemId, ItemStackType.ITEM_R1_3);

        float xOffset = (float) buffer.readByte() / 16.0F;
        float yOffset = (float) buffer.readByte() / 16.0F;
        float zOffset = (float) buffer.readByte() / 16.0F;

        return new V1_3BlockPlacePacketData(x, y, z, direction, itemStack, xOffset, yOffset, zOffset);
    }
}