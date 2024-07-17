package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.MapDataPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MapDataPacket extends AbstractPacket<MapDataPacketData> {
    private static final int ITEM_ID = 358;

    public MapDataPacket() {
        super(0x83);
    }

    @Override
    public ByteBuf writePacketData(MapDataPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(ITEM_ID);
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
