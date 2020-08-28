package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.LoginPacket;

public class V1_1LoginPacketData extends Packet<LoginPacket> {
    private int entityId;
    private String playerName;
    private long seed;
    private WorldType worldType;
    private int gamemode;
    private int dimension;
    private int difficulty;
    private int worldHeight;
    private int maxPlayers;

    public V1_1LoginPacketData(final int entityId, final String playerName, final long seed, WorldType worldType,
                               final int gamemode, final int dimension, final int difficulty, final int worldHeight, final int maxPlayers) {
        this.entityId = entityId;
        this.playerName = playerName;
        this.seed = seed;
        this.worldType = worldType;
        this.gamemode = gamemode;
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.worldHeight = worldHeight;
        this.maxPlayers = maxPlayers;
    }

    public int getEntityId() {
        return this.entityId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public long getSeed() {
        return this.seed;
    }

    public WorldType getWorldType() {
        return worldType;
    }

    public int getGamemode() {
        return gamemode;
    }

    public int getDimension() {
        return this.dimension;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getWorldHeight() {
        return worldHeight;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    @Override
    public Class<LoginPacket> getPacketClass() {
        return LoginPacket.class;
    }

    @Override
    public String toString() {
        return "V1_1LoginPacketData{"
                + "entityId=" + entityId
                + ", playerName='" + playerName + '\''
                + ", seed=" + seed
                + ", worldType='" + worldType.name() + '\''
                + ", gamemode=" + gamemode
                + ", dimension=" + dimension
                + ", difficulty=" + difficulty
                + ", worldHeight=" + worldHeight
                + ", maxPlayers=" + maxPlayers
                + '}';
    }
}