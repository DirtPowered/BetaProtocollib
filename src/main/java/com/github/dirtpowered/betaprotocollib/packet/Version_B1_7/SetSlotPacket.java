package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3SetSlotPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SetSlotPacket extends AbstractPacket<V1_7_3SetSlotPacketData> {

    public SetSlotPacket() {
        super(0x67);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3SetSlotPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getItemStack();

        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemSlot());

        writeItemStack(buffer, item, ItemStackType.ITEM_B1_7);
        return buffer;
    }

    @Override
    public V1_7_3SetSlotPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int itemSlot = buffer.readShort();

        int itemId = buffer.readShort();
        return new V1_7_3SetSlotPacketData(windowId, itemSlot, readItemStack(buffer, itemId, ItemStackType.ITEM_B1_7));
    }
}
