package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.StatisticsPacket;

public class StatisticsPacketData extends Packet {

    private int statId;
    private int data;

    public StatisticsPacketData(int statId, int data) {
        this.statId = statId;
        this.data = data;
    }

    public int getStatId() {
        return statId;
    }

    public int getData() {
        return data;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) StatisticsPacket.class;
    }
}
