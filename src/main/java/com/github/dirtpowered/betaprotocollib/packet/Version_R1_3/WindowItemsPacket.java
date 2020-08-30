package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3WindowItemsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class WindowItemsPacket extends AbstractPacket<V1_3WindowItemsPacketData> {

    public WindowItemsPacket() {
        super(0x68);
    }

    @Override
    public ByteBuf writePacketData(V1_3WindowItemsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemStacks().length);

        for (BetaItemStack item : packet.getItemStacks()) {
            writeItemStack(buffer, item, ItemStackType.ITEM_R1_3);
        }
        return buffer;
    }

    @Override
    public V1_3WindowItemsPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        short windowSlots = buffer.readShort();
        BetaItemStack[] itemStack = new BetaItemStack[windowSlots];

        for (int slot = 0; slot < windowSlots; ++slot) {
            short itemId = buffer.readShort();
            itemStack[slot] = readItemStack(buffer, itemId, ItemStackType.ITEM_R1_3);
        }
        return new V1_3WindowItemsPacketData(windowId, itemStack);
    }
}
