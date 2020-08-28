package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3WindowClickPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class WindowClickPacket extends AbstractPacket<V1_7_3WindowClickPacketData> {

    public WindowClickPacket() {
        super(0x66);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3WindowClickPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack item = packet.getItemStack();

        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getInventorySlot());
        buffer.writeByte(packet.getMouseClick());
        buffer.writeShort(packet.getAction());
        buffer.writeBoolean(packet.isShiftPressed());

        writeItemStack(buffer, item, ItemStackType.ITEM_B1_7);
        return buffer;
    }

    @Override
    public V1_7_3WindowClickPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int inventorySlot = buffer.readShort();
        int mouseClick = buffer.readByte();
        short action = buffer.readShort();
        boolean shiftPressed = buffer.readBoolean();

        short itemId = buffer.readShort();
        return new V1_7_3WindowClickPacketData(windowId, inventorySlot, mouseClick, action, readItemStack(buffer, itemId, ItemStackType.ITEM_B1_7), shiftPressed);
    }
}
