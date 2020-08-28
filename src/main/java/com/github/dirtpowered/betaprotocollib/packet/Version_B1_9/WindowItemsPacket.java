package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data.V1_9WindowItemsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class WindowItemsPacket extends AbstractPacket<V1_9WindowItemsPacketData> {

    public WindowItemsPacket() {
        super(0x68);
    }

    @Override
    public ByteBuf writePacketData(V1_9WindowItemsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemStacks().length);

        for (BetaItemStack item : packet.getItemStacks()) {
            writeItemStack(buffer, item, ItemStackType.ITEM_B1_9);
        }
        return buffer;
    }

    @Override
    public V1_9WindowItemsPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        short windowSlots = buffer.readShort();
        BetaItemStack[] itemStack = new BetaItemStack[windowSlots];

        for (int slot = 0; slot < windowSlots; ++slot) {
            short itemId = buffer.readShort();
            itemStack[slot] = readItemStack(buffer, itemId, ItemStackType.ITEM_B1_9);
        }
        return new V1_9WindowItemsPacketData(windowId, itemStack);
    }
}
