package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RespawnPacket;

public class RespawnPacketData extends Packet {

    private int dimension;
    private int difficulty;
    private int gamemode;
    private int worldHeight;
    private long mapSeed;

    public RespawnPacketData(int dimension, int difficulty, int gamemode, int worldHeight, long mapSeed) {
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.gamemode = gamemode;
        this.worldHeight = worldHeight;
        this.mapSeed = mapSeed;
    }

    public int getDimension() {
        return dimension;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getGamemode() {
        return gamemode;
    }

    public int getWorldHeight() {
        return worldHeight;
    }

    public long getMapSeed() {
        return mapSeed;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) RespawnPacket.class;
    }
}
