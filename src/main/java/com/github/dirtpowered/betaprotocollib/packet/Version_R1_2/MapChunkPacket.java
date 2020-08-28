package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2MapChunkPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class MapChunkPacket extends AbstractPacket<V1_2MapChunkPacketData> {

    public MapChunkPacket() {
        super(0x33);
    }

    @Override
    public ByteBuf writePacketData(V1_2MapChunkPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getChunkX());
        buffer.writeInt(packet.getChunkZ());
        buffer.writeBoolean(packet.isGroundUp());
        buffer.writeShort(packet.getPrimaryBitmap() & 65535);
        buffer.writeShort(packet.getAdditionalBitmap() & 65535);
        buffer.writeInt(packet.getCompressedDataSize());
        buffer.writeInt(packet.getNoop());
        buffer.writeBytes(packet.getData(), 0, packet.getCompressedDataSize());
        return buffer;
    }

    @Override
    public V1_2MapChunkPacketData readPacketData(ByteBuf buffer) throws IOException {
        int chunkX = buffer.readInt();
        int chunkZ = buffer.readInt();
        boolean groundUp = buffer.readBoolean();
        short primaryBitmap = buffer.readShort();
        short additionalBitmap = buffer.readShort();
        int compressedDataSize = buffer.readInt();
        int noop = buffer.readInt();

        byte[] chunk = new byte[compressedDataSize];
        buffer.readBytes(chunk, 0, compressedDataSize);

        int i = 0;
        for (int j = 0; j < 16; j++) {
            i += primaryBitmap >> j & 1;
        }

        int size = 12288 * i;

        if (groundUp) {
            size += 256;
        }

        byte[] buf = new byte[size];

        Inflater inflater = new Inflater();
        inflater.setInput(chunk, 0, compressedDataSize);

        try {
            inflater.inflate(buf);
        } catch (DataFormatException e) {
            throw new IOException("Bad compressed data format");
        } finally {
            inflater.end();
        }
        return new V1_2MapChunkPacketData(chunkX, chunkZ, groundUp, primaryBitmap, additionalBitmap, compressedDataSize, noop, chunk);
    }
}
