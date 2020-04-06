package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.OpenWindowPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class OpenWindowPacket extends AbstractPacket<OpenWindowPacketData> {

    public OpenWindowPacket() {
        super(0x64);
    }

    @Override
    public ByteBuf writePacketData(OpenWindowPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeByte(packet.getInventoryType());
        writeString(packet.getWindowTitle(), buffer);
        buffer.writeByte(packet.getSlotsCount());
        return buffer;
    }

    @Override
    public OpenWindowPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int inventoryType = buffer.readByte();
        String title = readString(buffer, 48);
        int slotsCount = buffer.readByte();

        return new OpenWindowPacketData(windowId, inventoryType, title, slotsCount);
    }
}
