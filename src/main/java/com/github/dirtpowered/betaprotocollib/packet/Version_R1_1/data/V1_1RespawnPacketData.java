package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.RespawnPacket;

public class V1_1RespawnPacketData extends Packet<RespawnPacket> {
    private int dimension;
    private int difficulty;
    private int gamemode;
    private int worldHeight;
    private long mapSeed;
    private WorldType worldType;

    public V1_1RespawnPacketData(int dimension, int difficulty, int gamemode, int worldHeight, long mapSeed, WorldType worldType) {
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.gamemode = gamemode;
        this.worldHeight = worldHeight;
        this.mapSeed = mapSeed;
        this.worldType = worldType;
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

    public WorldType getWorldType() {
        return worldType;
    }

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }

    @Override
    public String toString() {
        return "V1_1RespawnPacketData{"
                + "dimension=" + dimension
                + ", difficulty=" + difficulty
                + ", gamemode=" + gamemode
                + ", worldHeight=" + worldHeight
                + ", mapSeed=" + mapSeed
                + ", worldType='" + worldType.name() + '\''
                + '}';
    }
}
