package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.CreativeItemGetPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CreativeItemGetPacket extends AbstractPacket<CreativeItemGetPacketData> {

    public CreativeItemGetPacket() {
        super(0x6B);
    }

    @Override
    public ByteBuf writePacketData(CreativeItemGetPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getSlotId());
        BetaItemStack item = packet.getItemStack();

        buffer.writeShort(item.getBlockId());
        buffer.writeShort(item.getAmount());
        buffer.writeShort(item.getData());
        return buffer;
    }

    @Override
    public CreativeItemGetPacketData readPacketData(ByteBuf buffer) {
        short slotId = buffer.readShort();
        int blockId = buffer.readShort();
        int amount = buffer.readShort();
        int data = buffer.readShort();

        return new CreativeItemGetPacketData(slotId, new BetaItemStack(blockId, amount, data));
    }
}
