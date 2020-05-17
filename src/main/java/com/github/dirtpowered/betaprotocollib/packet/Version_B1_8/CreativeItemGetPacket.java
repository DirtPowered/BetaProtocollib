package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.CreativeItemGetPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;

public class CreativeItemGetPacket extends AbstractPacket<CreativeItemGetPacketData> {

    public CreativeItemGetPacket() {
        super(0x6B);
    }

    @Override
    public ByteBuf writePacketData(CreativeItemGetPacketData packet) throws IOException {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getSlotId());
        BetaItemStack item = packet.getItemStack();

        if (item == null || item.getBlockId() == 0) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(item.getBlockId());
            buffer.writeByte(item.getAmount());
            buffer.writeShort(item.getData());
        }
        return buffer;
    }

    @Override
    public CreativeItemGetPacketData readPacketData(ByteBuf buffer) throws IOException {
        short slotId = buffer.readShort();
        int itemId = buffer.readShort();
        BetaItemStack itemStack = null;

        if (itemId >= 0) {
            int stackSize = buffer.readByte();
            int itemData = buffer.readShort();
            itemStack = new BetaItemStack(itemId, stackSize, itemData);
        }
        return new CreativeItemGetPacketData(slotId, itemStack);
    }
}
