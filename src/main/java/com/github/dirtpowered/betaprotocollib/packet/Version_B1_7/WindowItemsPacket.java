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
                buffer.writeByte(item.getData());
            }
        }
        return buffer;
    }

    @Override
    public WindowItemsPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        short var2 = buffer.readShort();
        BetaItemStack[] itemStack = new BetaItemStack[var2];

        for (int var3 = 0; var3 < var2; ++var3) {
            short var4 = buffer.readShort();
            if (var4 >= 0) {
                byte var5 = buffer.readByte();
                short var6 = buffer.readShort();
                itemStack[var3] = new BetaItemStack(var4, var5, var6);
            }
        }
        return new WindowItemsPacketData(windowId, itemStack);
    }
}
