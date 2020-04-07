package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.NamedEntitySpawnPacket;

public class NamedEntitySpawnPacketData extends Packet<NamedEntitySpawnPacket> {

    private int entityId;
    private String name;
    private int x;
    private int y;
    private int z;
    private byte rotation;
    private byte pitch;
    private int currentItem;

    public NamedEntitySpawnPacketData(int entityId, String name, int x, int y, int z, byte rotation, byte pitch, int currentItem) {
        this.entityId = entityId;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.rotation = rotation;
        this.pitch = pitch;
        this.currentItem = currentItem;
    }

    public int getEntityId() {
        return entityId;
    }

    public String getName() {
        return name;
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

    public byte getRotation() {
        return rotation;
    }

    public byte getPitch() {
        return pitch;
    }

    public int getCurrentItem() {
        return currentItem;
    }

    @Override
    public Class<NamedEntitySpawnPacket> getPacketClass() {
        return NamedEntitySpawnPacket.class;
    }

    @Override
    public String toString() {
        return "NamedEntitySpawnPacketData{"
                + "entityId=" + entityId
                + ", name='" + name + '\''
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", rotation=" + rotation
                + ", pitch=" + pitch
                + ", currentItem=" + currentItem
                + '}';
    }
}
