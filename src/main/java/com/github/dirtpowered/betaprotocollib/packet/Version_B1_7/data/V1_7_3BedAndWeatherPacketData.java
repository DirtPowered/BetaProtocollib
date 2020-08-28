package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BedAndWeatherPacket;

public class V1_7_3BedAndWeatherPacketData extends Packet<BedAndWeatherPacket> {
    private int weatherState;

    public V1_7_3BedAndWeatherPacketData(int weatherState) {
        this.weatherState = weatherState;
    }

    public int getWeatherState() {
        return weatherState;
    }

    @Override
    public Class<BedAndWeatherPacket> getPacketClass() {
        return BedAndWeatherPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3BedAndWeatherPacketData{"
                + "weatherState=" + weatherState
                + '}';
    }
}
