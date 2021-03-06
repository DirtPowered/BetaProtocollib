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
        BetaItemStack item = packet.getItemStack();

        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getItemSlot());

        writeItemStack(buffer, item);
        return buffer;
    }

    @Override
    public SetSlotPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int itemSlot = buffer.readShort();

        int itemId = buffer.readShort();
        return new SetSlotPacketData(windowId, itemSlot, readItemStack(buffer, itemId));
    }
}
