package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MobSpawnPacket;

import java.util.List;

public class V1_2MobSpawnPacketData extends Packet<MobSpawnPacket> {
    private int entityId;
    private byte type;
    private int x;
    private int y;
    private int z;
    private byte yaw;
    private byte pitch;
    private byte headYaw;
    private List<WatchableObject> metadata;

    public V1_2MobSpawnPacketData(int entityId, byte type, int x, int y, int z, byte yaw, byte pitch, byte headYaw, List<WatchableObject> metadata) {
        this.entityId = entityId;
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.headYaw = headYaw;
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

    public byte getHeadYaw() {
        return headYaw;
    }

    @Override
    public Class<MobSpawnPacket> getPacketClass() {
        return MobSpawnPacket.class;
    }

    @Override
    public String toString() {
        return "V1_2MobSpawnPacketData{"
                + "entityId=" + entityId
                + ", type=" + type
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", yaw=" + yaw
                + ", pitch=" + pitch
                + ", headYaw=" + headYaw
                + ", metadata=" + metadata
                + '}';
    }
}
