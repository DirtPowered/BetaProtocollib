package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateTimePacket;

public class UpdateTimePacketData extends Packet {

    private long time;

    public UpdateTimePacketData(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) UpdateTimePacket.class;
    }
}
