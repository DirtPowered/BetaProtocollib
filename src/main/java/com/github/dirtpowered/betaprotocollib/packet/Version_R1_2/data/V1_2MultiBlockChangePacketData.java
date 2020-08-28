package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MultiBlockChangePacket;

import java.util.Arrays;

public class V1_2MultiBlockChangePacketData extends Packet<MultiBlockChangePacket> {
    private int chunkX;
    private int chunkZ;
    private int recordCount;
    private int dataSize;
    private byte[] data;

    public V1_2MultiBlockChangePacketData(int chunkX, int chunkZ, int recordCount, int dataSize, byte[] data) {
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
        this.recordCount = recordCount;
        this.dataSize = dataSize;
        this.data = data;
    }

    public int getChunkX() {
        return chunkX;
    }

    public int getChunkZ() {
        return chunkZ;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public int getDataSize() {
        return dataSize;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public Class<MultiBlockChangePacket> getPacketClass() {
        return MultiBlockChangePacket.class;
    }

    @Override
    public String toString() {
        return "V1_2MultiBlockChangePacketData{"
                + "chunkX=" + chunkX
                + ", chunkZ=" + chunkZ
                + ", recordCount=" + recordCount
                + ", dataSize=" + dataSize
                + ", data=" + Arrays.toString(data)
                + '}';
    }
}
