package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3MapDataPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MapDataPacket extends AbstractPacket<V1_7_3MapDataPacketData> {

    public MapDataPacket() {
        super(0x83);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3MapDataPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0); //always 0
        buffer.writeShort(packet.getMapId());
        buffer.writeByte(packet.getData().length);
        buffer.writeBytes(packet.getData());
        return buffer;
    }

    @Override
    public V1_7_3MapDataPacketData readPacketData(ByteBuf buffer) {
        buffer.readShort();
        int mapId = buffer.readShort();
        byte[] data = new byte[buffer.readByte() & 255];
        buffer.readBytes(data);
        return new V1_7_3MapDataPacketData(mapId, data);
    }
}
