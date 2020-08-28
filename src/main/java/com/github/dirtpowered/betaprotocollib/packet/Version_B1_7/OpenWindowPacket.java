package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3OpenWindowPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

public class OpenWindowPacket extends AbstractPacket<V1_7_3OpenWindowPacketData> {

    public OpenWindowPacket() {
        super(0x64);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3OpenWindowPacketData packet) {
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
    public V1_7_3OpenWindowPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int inventoryType = buffer.readByte();

        int lenght = buffer.readShort();
        byte[] bytes = new byte[lenght];
        buffer.readBytes(bytes);

        int slotsCount = buffer.readByte();

        return new V1_7_3OpenWindowPacketData(windowId, inventoryType, new String(bytes, Charset.forName("UTF-8")), slotsCount);
    }
}
