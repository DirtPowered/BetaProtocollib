package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.StatisticsPacket;

public class StatisticsPacketData extends Packet<StatisticsPacket> {

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
    public Class<StatisticsPacket> getPacketClass() {
        return StatisticsPacket.class;
    }

    @Override
    public String toString() {
        return "StatisticsPacketData{"
                + "statId=" + statId
                + ", data=" + data
                + '}';
    }
}
