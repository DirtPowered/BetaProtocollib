package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.BedAndWeatherPacket;

public class BedAndWeatherPacketData extends Packet {

    private int weatherState;

    public BedAndWeatherPacketData(int weatherState) {
        this.weatherState = weatherState;
    }

    public int getWeatherState() {
        return weatherState;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) BedAndWeatherPacket.class;
    }
}
