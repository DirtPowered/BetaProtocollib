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
            if (item == null || item.getBlockId() == 0) {
                buffer.writeShort(-1);
            } else {
                buffer.writeShort(item.getBlockId());
                buffer.writeByte(item.getAmount());
                buffer.writeShort(item.getData());
            }
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
            if (itemId >= 0) {
                byte amount = buffer.readByte();
                short data = buffer.readShort();
                itemStack[slot] = new BetaItemStack(itemId, amount, data);
            }
        }
        return new WindowItemsPacketData(windowId, itemStack);
    }
}
