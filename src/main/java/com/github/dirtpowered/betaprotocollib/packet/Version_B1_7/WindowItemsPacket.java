package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.WindowItemsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class WindowItemsPacket extends AbstractPacket<WindowItemsPacketData> {

    public WindowItemsPacket() {
        super(0x68);
    }

    @Override
    public ByteBuf writePacketData(WindowItemsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemStacks().length);

        for (BetaItemStack item : packet.getItemStacks()) {
            writeItemStack(buffer, item);
        }
        return buffer;
    }

    @Override
    public WindowItemsPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        short windowSlots = buffer.readShort();
        BetaItemStack[] itemStack = new BetaItemStack[windowSlots];

        for (int slot = 0; slot < windowSlots; ++slot) {
            short itemId = buffer.readShort();
            itemStack[slot] = readItemStack(buffer, itemId);
        }
        return new WindowItemsPacketData(windowId, itemStack);
    }
}
