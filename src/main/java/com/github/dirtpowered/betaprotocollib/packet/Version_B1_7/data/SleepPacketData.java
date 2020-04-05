package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SleepPacket;

public class SleepPacketData extends Packet {
    private int entityId;
    private boolean wakeup;
    private int x;
    private int y;
    private int z;

    public SleepPacketData(int entityId, boolean wakeup, int x, int y, int z) {
        this.entityId = entityId;
        this.wakeup = wakeup;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getEntityId() {
        return entityId;
    }

    public boolean isWakeup() {
        return wakeup;
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

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) SleepPacket.class;
    }
}
