package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.LoginPacket;

public class LoginPacketData extends Packet {
    private int entityId;
    private String playerName;
    private long seed;
    private int dimension;

    public LoginPacketData(final int entityId, final String playerName, final long seed, final int dimension) {
        this.entityId = entityId;
        this.playerName = playerName;
        this.seed = seed;
        this.dimension = dimension;
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

    public int getDimension() {
        return this.dimension;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) LoginPacket.class;
    }
}