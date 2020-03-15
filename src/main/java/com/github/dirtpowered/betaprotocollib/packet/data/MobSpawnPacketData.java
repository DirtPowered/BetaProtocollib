package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.MobSpawnPacket;

import java.util.List;

public class MobSpawnPacketData extends Packet {
    private int entityId;
    private byte type;
    private int x;
    private int y;
    private int z;
    private byte yaw;
    private byte pitch;
    private List<WatchableObject> metadata;

    public MobSpawnPacketData(int entityId, byte type, int x, int y, int z, byte yaw, byte pitch, List<WatchableObject> metadata) {
        this.entityId = entityId;
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.metadata = metadata;
    }

    public int getEntityId() {
        return entityId;
    }

    public byte getType() {
        return type;
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

    public byte getYaw() {
        return yaw;
    }

    public byte getPitch() {
        return pitch;
    }

    public List<WatchableObject> getMetadata() {
        return metadata;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) MobSpawnPacket.class;
    }
}
