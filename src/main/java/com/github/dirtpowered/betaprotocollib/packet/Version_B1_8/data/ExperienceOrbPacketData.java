package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceOrbPacket;

public class ExperienceOrbPacketData extends Packet {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private short count;

    public ExperienceOrbPacketData(int entityId, int x, int y, int z, short count) {
        this.entityId = entityId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.count = count;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public short getCount() {
        return count;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) ExperienceOrbPacket.class;
    }
}
