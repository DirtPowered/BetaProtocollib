package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapDataPacket;

import java.util.Arrays;

public class V1_7_3MapDataPacketData extends Packet<MapDataPacket> {

    private int mapId;
    private byte[] data;

    public V1_7_3MapDataPacketData(int mapId, byte[] data) {
        this.mapId = mapId;
        this.data = data;
    }

    public int getMapId() {
        return mapId;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public Class<MapDataPacket> getPacketClass() {
        return MapDataPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3MapDataPacketData{"
                + "mapId=" + mapId
                + ", data=" + Arrays.toString(data)
                + '}';
    }
}
