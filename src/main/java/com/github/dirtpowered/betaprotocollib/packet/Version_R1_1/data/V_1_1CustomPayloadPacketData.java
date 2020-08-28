package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.CustomPayloadPacket;

import java.util.Arrays;

public class V_1_1CustomPayloadPacketData extends Packet<CustomPayloadPacket> {
    private String channel;
    private int size;
    private byte[] data;

    public V_1_1CustomPayloadPacketData(String channel, int size, byte[] data) {
        this.channel = channel;
        this.size = size;
        this.data = data;
    }

    public String getChannel() {
        return channel;
    }

    public int getSize() {
        return size;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public Class<CustomPayloadPacket> getPacketClass() {
        return CustomPayloadPacket.class;
    }

    @Override
    public String toString() {
        return "V_1_1CustomPayloadPacketData{"
                + "channel='" + channel + '\''
                + ", size=" + size
                + ", data=" + Arrays.toString(data)
                + '}';
    }
}
