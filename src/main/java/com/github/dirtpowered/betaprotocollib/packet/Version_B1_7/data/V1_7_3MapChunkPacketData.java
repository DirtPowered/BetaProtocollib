package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapChunkPacket;

import java.util.Arrays;

public class V1_7_3MapChunkPacketData extends Packet<MapChunkPacket> {
    private int x;
    private int y;
    private int z;
    private int xSize;
    private int ySize;
    private int zSize;
    private byte[] chunk;

    public V1_7_3MapChunkPacketData(int x, int y, int z, int xSize, int ySize, int zSize, byte[] chunk) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.xSize = xSize;
        this.ySize = ySize;
        this.zSize = zSize;

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
    public Class<MapChunkPacket> getPacketClass() {
        return MapChunkPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3MapChunkPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", xSize=" + xSize
                + ", ySize=" + ySize
                + ", zSize=" + zSize
                + ", chunk=" + Arrays.toString(chunk)
                + '}';
    }
}
