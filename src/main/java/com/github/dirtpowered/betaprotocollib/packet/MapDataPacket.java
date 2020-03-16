package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.MapDataPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MapDataPacket extends AbstractPacket<MapDataPacketData> {

    public MapDataPacket() {
        super(0x83);
    }

    @Override
    public ByteBuf writePacketData(MapDataPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0); //always 0
        buffer.writeShort(packet.getMapId());
        buffer.writeByte(packet.getData().length);
        buffer.writeBytes(packet.getData());
        return buffer;
    }

    @Override
    public MapDataPacketData readPacketData(ByteBuf buffer) {
        buffer.readShort();
        int mapId = buffer.readShort();
        byte[] data = new byte[buffer.readByte() & 255];
        buffer.readBytes(data);
        return new MapDataPacketData(mapId, data);
    }
}
