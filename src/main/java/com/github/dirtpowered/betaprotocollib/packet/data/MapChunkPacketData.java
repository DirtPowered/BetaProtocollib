package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.MapChunkPacket;

public class MapChunkPacketData extends Packet {
    private int x;
    private int y;
    private int z;
    private int xSize;
    private int ySize;
    private int zSize;
    private byte[] chunk;

    /*
     * https://wiki.vg/index.php?title=Protocol&oldid=689#Map_Chunk_.280x33.29
     *
     * Packet data (from original mc-server):
     * xPosition: 112
     * yPosition: 0
     * zPosition: -128
     * xSize: 15
     * ySize: 127
     * zSize: 15
     */
    public MapChunkPacketData(int x, int y, int z, byte[] chunk) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.xSize = 15;
        this.ySize = 127;
        this.zSize = 15;

        this.chunk = chunk.clone();
    }

    public int getXSize() {
        return xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public int getZSize() {
        return zSize;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public byte[] getChunk() {
        return chunk.clone();
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) MapChunkPacket.class;
    }
}
