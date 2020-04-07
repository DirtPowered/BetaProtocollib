package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.LoginPacket;

public class LoginPacketData extends Packet<LoginPacket> {

    private int entityId;
    private String playerName;
    private long seed;
    private int gamemode;
    private int dimension;
    private int difficulty;
    private int worldHeight;
    private int maxPlayers;

    public LoginPacketData(final int entityId, final String playerName, final long seed,
                           final int gamemode, final int dimension, final int difficulty, final int worldHeight, final int maxPlayers) {
        this.entityId = entityId;
        this.playerName = playerName;
        this.seed = seed;
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
        return "LoginPacketData{"
                + "entityId=" + entityId
                + ", playerName='" + playerName + '\''
                + ", seed=" + seed
                + ", gamemode=" + gamemode
                + ", dimension=" + dimension
                + ", difficulty=" + difficulty
                + ", worldHeight=" + worldHeight
                + ", maxPlayers=" + maxPlayers
                + '}';
    }
}