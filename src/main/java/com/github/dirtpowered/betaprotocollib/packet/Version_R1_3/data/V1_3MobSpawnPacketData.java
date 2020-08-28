package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.MobSpawnPacket;

import java.util.List;

public class V1_3MobSpawnPacketData extends Packet<MobSpawnPacket> {
    private int entityId;
    private byte type;
    private int x;
    private int y;
    private int z;
    private byte yaw;
    private byte pitch;
    private byte headYaw;
    private int velocityX;
    private int velocityY;
    private int velocityZ;
    private List<WatchableObject> metadata;

    public V1_3MobSpawnPacketData(int entityId, byte type, int x, int y, int z, byte yaw, byte pitch, byte headYaw,
                                  int velocityX, int velocityY, int velocityZ, List<WatchableObject> metadata) {
        this.entityId = entityId;
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.headYaw = headYaw;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
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

    public int getVelocityX() {
        return velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public int getVelocityZ() {
        return velocityZ;
    }

    @Override
    public Class<MobSpawnPacket> getPacketClass() {
        return MobSpawnPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3MobSpawnPacketData{"
                + "entityId=" + entityId
                + ", type=" + type
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", velocityX=" + velocityX
                + ", velocityY=" + velocityY
                + ", velocityZ=" + velocityZ
                + ", yaw=" + yaw
                + ", pitch=" + pitch
                + ", headYaw=" + headYaw
                + ", metadata=" + metadata
                + '}';
    }
}
