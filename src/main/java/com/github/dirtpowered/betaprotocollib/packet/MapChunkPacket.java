package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.MapChunkPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.zip.Deflater;

public class MapChunkPacket extends AbstractPacket<MapChunkPacketData> {

    public MapChunkPacket() {
        super(0x33);
    }

    @Override
    public ByteBuf writePacketData(MapChunkPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getXSize());
        buffer.writeByte(packet.getYSize());
        buffer.writeByte(packet.getZSize());

        byte[] var8 = packet.getChunk();
        Deflater var9 = new Deflater(-1);

        try {
            var9.setInput(var8);
            var9.finish();
            byte[] chunk = new byte[(packet.getXSize() + 1) * (packet.getZSize() + 1) * (packet.getYSize() + 1) * 5 / 2];
            int chunkSize = var9.deflate(chunk);

            buffer.writeInt(chunkSize);
            buffer.writeBytes(chunk, 0, chunkSize);
        } finally {
            var9.end();
        }
        return buffer;
    }

    @Override
    public MapChunkPacketData readPacketData(ByteBuf buffer) {
        return new MapChunkPacketData(0, 0, 0, new byte[0]);
    }
}
