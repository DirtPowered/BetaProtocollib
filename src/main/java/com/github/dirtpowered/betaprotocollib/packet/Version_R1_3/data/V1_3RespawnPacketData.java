package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.RespawnPacket;

public class V1_3RespawnPacketData extends Packet<RespawnPacket> {
    private int dimension;
    private int difficulty;
    private int gamemode;
    private int worldHeight;
    private WorldType worldType;

    public V1_3RespawnPacketData(int dimension, int difficulty, int gamemode, int worldHeight, WorldType worldType) {
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.gamemode = gamemode;
        this.worldHeight = worldHeight;
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

    public WorldType getWorldType() {
        return worldType;
    }

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3RespawnPacketData{"
                + "dimension=" + dimension
                + ", difficulty=" + difficulty
                + ", gamemode=" + gamemode
                + ", worldHeight=" + worldHeight
                + ", worldType='" + worldType.name() + '\''
                + '}';
    }
}
