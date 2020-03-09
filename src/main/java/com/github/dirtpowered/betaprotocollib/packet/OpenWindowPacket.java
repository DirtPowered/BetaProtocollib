package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.OpenWindowPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

public class OpenWindowPacket extends AbstractPacket<OpenWindowPacketData> {

    public OpenWindowPacket() {
        super(0x64);
    }

    @Override
    public ByteBuf writePacketData(OpenWindowPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeByte(packet.getInventoryType());

        byte[] message = packet.getWindowTitle().getBytes(Charset.forName("UTF-8"));
        buffer.writeShort(message.length);
        buffer.writeBytes(message);

        buffer.writeByte(packet.getSlotsCount());
        return buffer;
    }

    @Override
    public OpenWindowPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int inventoryType = buffer.readByte();

        int lenght = buffer.readShort();
        byte[] bytes = new byte[lenght];
        buffer.readBytes(bytes);

        int slotsCount = buffer.readByte();

        return new OpenWindowPacketData(windowId, inventoryType, new String(bytes, Charset.forName("UTF-8")), slotsCount);
    }
}
