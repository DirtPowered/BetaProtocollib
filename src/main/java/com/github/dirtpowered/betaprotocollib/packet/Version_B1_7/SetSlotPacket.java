package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.SetSlotPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SetSlotPacket extends AbstractPacket<SetSlotPacketData> {

    public SetSlotPacket() {
        super(0x67);
    }

    @Override
    public ByteBuf writePacketData(SetSlotPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemSlot());

        if (packet.getItemStack() == null || packet.getItemStack().getBlockId() == 0) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(packet.getItemStack().getBlockId());
            buffer.writeByte(packet.getItemStack().getAmount());
            buffer.writeShort(packet.getItemStack().getData());
        }

        return buffer;
    }

    @Override
    public SetSlotPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int itemSlot = buffer.readShort();
        BetaItemStack itemStack = null;

        int itemId = buffer.readShort();

        if (itemId >= 0) {
            int stackSize = buffer.readByte();
            int itemData = buffer.readShort();
            itemStack = new BetaItemStack(itemId, stackSize, itemData);
        }

        return new SetSlotPacketData(windowId, itemSlot, itemStack);
    }
}
