package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapDataPacket;

public class MapDataPacketData extends Packet {

    private int mapId;
    private byte[] data;

    public MapDataPacketData(int mapId, byte[] data) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) MapDataPacket.class;
    }
}
