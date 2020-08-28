package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MapChunkPacket;

import java.util.Arrays;

public class V1_2MapChunkPacketData extends Packet<MapChunkPacket> {
    private int chunkX;
    private int chunkZ;
    private boolean groundUp;
    private short primaryBitmap;
    private short additionalBitmap;
    private int compressedDataSize;
    private int noop;
    private byte[] data;

    public V1_2MapChunkPacketData(int chunkX, int chunkZ, boolean groundUp, short primaryBitmap,
                                  short additionalBitmap, int compressedDataSize, int noop, byte[] data) {
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
        this.groundUp = groundUp;
        this.primaryBitmap = primaryBitmap;
        this.additionalBitmap = additionalBitmap;
        this.compressedDataSize = compressedDataSize;
        this.noop = noop;
        this.data = data;
    }

    public int getChunkX() {
        return chunkX;
    }

    public int getChunkZ() {
        return chunkZ;
    }

    public boolean isGroundUp() {
        return groundUp;
    }

    public short getPrimaryBitmap() {
        return primaryBitmap;
    }

    public short getAdditionalBitmap() {
        return additionalBitmap;
    }

    public int getCompressedDataSize() {
        return compressedDataSize;
    }

    public int getNoop() {
        return noop;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public Class<MapChunkPacket> getPacketClass() {
        return MapChunkPacket.class;
    }

    @Override
    public String toString() {
        return "V1_2MapChunkPacketData{"
                + "chunkX=" + chunkX
                + ", chunkZ=" + chunkZ
                + ", groundUp=" + groundUp
                + ", primaryBitmap=" + primaryBitmap
                + ", additionalBitmap=" + additionalBitmap
                + ", compressedDataSize=" + compressedDataSize
                + ", noop=" + noop
                + ", data=" + Arrays.toString(data)
                + '}';
    }
}
