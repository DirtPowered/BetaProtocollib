package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.BedAndWeatherPacket;

public class BedAndWeatherPacketData extends Packet {

    private int reason;
    private int gamemode;

    public BedAndWeatherPacketData(int reason, int gamemode) {
        this.reason = reason;
        this.gamemode = gamemode;
    }

    public int getReason() {
        return reason;
    }

    public int getGamemode() {
        return gamemode;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) BedAndWeatherPacket.class;
    }
}
