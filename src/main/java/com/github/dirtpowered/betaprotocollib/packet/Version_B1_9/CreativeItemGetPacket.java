package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data.V1_9CreativeItemGetPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CreativeItemGetPacket extends AbstractPacket<V1_9CreativeItemGetPacketData> {

    public CreativeItemGetPacket() {
        super(0x6B);
    }

    @Override
    public ByteBuf writePacketData(V1_9CreativeItemGetPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getSlotId());
        BetaItemStack item = packet.getItemStack();

        writeItemStack(buffer, item, ItemStackType.ITEM_B1_9);
        return buffer;
    }

    @Override
    public V1_9CreativeItemGetPacketData readPacketData(ByteBuf buffer) {
        short slotId = buffer.readShort();
        int itemId = buffer.readShort();

        return new V1_9CreativeItemGetPacketData(slotId, readItemStack(buffer, itemId, ItemStackType.ITEM_B1_9));
    }
}
