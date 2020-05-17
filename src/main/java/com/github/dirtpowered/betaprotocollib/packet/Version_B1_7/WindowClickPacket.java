package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.WindowClickPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class WindowClickPacket extends AbstractPacket<WindowClickPacketData> {

    public WindowClickPacket() {
        super(0x66);
    }

    @Override
    public ByteBuf writePacketData(WindowClickPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getItemStack();

        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getInventorySlot());
        buffer.writeByte(packet.getMouseClick());
        buffer.writeShort(packet.getAction());
        buffer.writeBoolean(packet.isShiftPressed());

        if (item == null || item.getBlockId() == 0) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(item.getBlockId());
            buffer.writeByte(item.getAmount());
            buffer.writeShort(item.getData());
        }
        return buffer;
    }

    @Override
    public WindowClickPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int inventorySlot = buffer.readShort();
        int mouseClick = buffer.readByte();
        short action = buffer.readShort();
        boolean shiftPressed = buffer.readBoolean();

        BetaItemStack itemStack;

        short itemId = buffer.readShort();
        if (itemId != -1) {
            byte amount = buffer.readByte();
            short data = buffer.readShort();
            itemStack = new BetaItemStack(itemId, amount, data);
        } else {
            itemStack = null;
        }
        return new WindowClickPacketData(windowId, inventorySlot, mouseClick, action, itemStack, shiftPressed);
    }
}
