package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BedAndWeatherPacket;

public class BedAndWeatherPacketData extends Packet<BedAndWeatherPacket> {
    private int weatherState;

    public BedAndWeatherPacketData(int weatherState) {
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
        return "BedAndWeatherPacketData{"
                + "weatherState=" + weatherState
                + '}';
    }
}
