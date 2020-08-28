package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.LoginPacket;

public class V1_3LoginPacketData extends Packet<LoginPacket> {
    private int entityId;
    private WorldType worldType;
    private int gamemode;
    private int dimension;
    private int difficulty;
    private int worldHeight;
    private int maxPlayers;
    private boolean hardcore;

    public V1_3LoginPacketData(final int entityId, WorldType worldType,
                               final int gamemode, final int dimension, final int difficulty, final int worldHeight, final int maxPlayers, boolean hardcore) {
        this.entityId = entityId;
        this.worldType = worldType;
        this.gamemode = gamemode;
        this.dimension = dimension;
        this.difficulty = difficulty;
        this.worldHeight = worldHeight;
        this.maxPlayers = maxPlayers;
        this.hardcore = hardcore;
    }

    public int getEntityId() {
        return this.entityId;
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

    public boolean isHardcore() {
        return hardcore;
    }

    @Override
    public Class<LoginPacket> getPacketClass() {
        return LoginPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3LoginPacketData{"
                + "entityId=" + entityId
                + ", worldType=" + worldType
                + ", gamemode=" + gamemode
                + ", dimension=" + dimension
                + ", difficulty=" + difficulty
                + ", worldHeight=" + worldHeight
                + ", maxPlayers=" + maxPlayers
                + ", hardcore=" + hardcore
                + '}';
    }
}