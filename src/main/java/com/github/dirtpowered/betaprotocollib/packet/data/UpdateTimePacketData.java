package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.UpdateTimePacket;

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
