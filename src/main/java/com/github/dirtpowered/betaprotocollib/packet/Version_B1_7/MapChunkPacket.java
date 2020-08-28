package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3MapChunkPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class MapChunkPacket extends AbstractPacket<V1_7_3MapChunkPacketData> {

    public MapChunkPacket() {
        super(0x33);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3MapChunkPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getXSize() - 1);
        buffer.writeByte(packet.getYSize() - 1);
        buffer.writeByte(packet.getZSize() - 1);

        byte[] data = packet.getChunk();
        Deflater deflater = new Deflater(Deflater.BEST_SPEED);

        try {
            deflater.setInput(data);
            deflater.finish();
            byte[] chunk = new byte[(packet.getXSize() + 1) * (packet.getZSize() + 1) * (packet.getYSize() + 1) * 5 / 2];
            int chunkSize = deflater.deflate(chunk);

            buffer.writeInt(chunkSize);
            buffer.writeBytes(chunk, 0, chunkSize);
        } finally {
            deflater.end();
        }
        return buffer;
    }

    @Override
    public V1_7_3MapChunkPacketData readPacketData(ByteBuf buffer) throws IOException {
        int x = buffer.readInt();
        int y = buffer.readShort();
        int z = buffer.readInt();
        int xSize = buffer.readByte() + 1;
        int ySize = buffer.readByte() + 1;
        int zSize = buffer.readByte() + 1;

        int chunkSize = buffer.readInt();
        byte[] buf = new byte[chunkSize];

        byte[] chunk;
        if (xSize < 0 || ySize < 0 || zSize < 0) {
            chunk = new byte[81920];
            buffer.readBytes(buf);
        } else {
            chunk = new byte[xSize * ySize * zSize * 5 / 2];
            buffer.readBytes(buf);

            Inflater inflater = new Inflater();
            inflater.setInput(buf);
            try {
                inflater.inflate(chunk);
            } catch (DataFormatException e) {
                throw new IOException("Bad compressed data format");
            } finally {
                inflater.end();
            }
        }

        return new V1_7_3MapChunkPacketData(x, y, z, xSize, ySize, zSize, chunk);
    }
}
