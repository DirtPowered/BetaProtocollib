package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3SetSlotPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SetSlotPacket extends AbstractPacket<V1_3SetSlotPacketData> {

    public SetSlotPacket() {
        super(0x67);
    }

    @Override
    public ByteBuf writePacketData(V1_3SetSlotPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getItemStack();

        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemSlot());

        writeItemStack(buffer, item, ItemStackType.ITEM_R1_3);
        return buffer;
    }

    @Override
    public V1_3SetSlotPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int itemSlot = buffer.readShort();

        int itemId = buffer.readShort();
        return new V1_3SetSlotPacketData(windowId, itemSlot, readItemStack(buffer, itemId, ItemStackType.ITEM_R1_3));
    }
}
