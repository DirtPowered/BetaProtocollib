package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.LoginPacket;

public class V1_7_3LoginPacketData extends Packet<LoginPacket> {
    private int entityId;
    private String playerName;
    private long seed;
    private int dimension;

    public V1_7_3LoginPacketData(final int entityId, final String playerName, final long seed, final int dimension) {
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
    public Class<LoginPacket> getPacketClass() {
        return LoginPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3LoginPacketData{"
                + "entityId=" + entityId
                + ", playerName='" + playerName + '\''
                + ", seed=" + seed
                + ", dimension=" + dimension
                + '}';
    }
}