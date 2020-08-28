package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateTimePacket;

public class V1_7_3UpdateTimePacketData extends Packet<UpdateTimePacket> {

    private long time;

    public V1_7_3UpdateTimePacketData(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    @Override
    public Class<UpdateTimePacket> getPacketClass() {
        return UpdateTimePacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3UpdateTimePacketData{"
                + "time=" + time
                + '}';
    }
}
