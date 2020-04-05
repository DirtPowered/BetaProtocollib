package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MultiBlockChangePacket;

public class MultiBlockChangePacketData extends Packet {

    private int x;
    private int z;
    private short[] coordinateArray;
    private byte[] typeArray;
    private byte[] metadataArray;
    private int size;

    public MultiBlockChangePacketData(int x, int z, short[] coordinateArray, byte[] typeArray, byte[] metadataArray, int size) {
        this.x = x;
        this.z = z;

        this.coordinateArray = coordinateArray;
        this.typeArray = typeArray;
        this.metadataArray = metadataArray;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public short[] getCoordinateArray() {
        return coordinateArray;
    }

    public byte[] getTypeArray() {
        return typeArray;
    }

    public byte[] getMetadataArray() {
        return metadataArray;
    }

    public int getSize() {
        return size;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) MultiBlockChangePacket.class;
    }
}
