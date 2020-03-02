package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.PickupSpawnPacket;
import com.github.dirtpowered.betaprotocollib.utils.BetaItemStack;

public class PickupSpawnPacketData extends Packet {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private byte yaw;
    private byte pitch;
    private byte roll;
    private BetaItemStack itemStack;

    public PickupSpawnPacketData(int entityId, int x, int y, int z, byte yaw, byte pitch, byte roll, BetaItemStack itemStack) {
        this.entityId = entityId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
        this.itemStack = itemStack;
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

    public byte getYaw() {
        return yaw;
    }

    public byte getPitch() {
        return pitch;
    }

    public byte getRoll() {
        return roll;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PickupSpawnPacket.class;
    }
}
