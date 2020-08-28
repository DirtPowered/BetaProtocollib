package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PickupSpawnPacket;

public class V1_7_3PickupSpawnPacketData extends Packet<PickupSpawnPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private int yaw;
    private int pitch;
    private int roll;
    private BetaItemStack itemStack;

    public V1_7_3PickupSpawnPacketData(int entityId, int x, int y, int z, int yaw, int pitch, int roll, BetaItemStack itemStack) {
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

    public int getYaw() {
        return yaw;
    }

    public int getPitch() {
        return pitch;
    }

    public int getRoll() {
        return roll;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public Class<PickupSpawnPacket> getPacketClass() {
        return PickupSpawnPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3PickupSpawnPacketData{"
                + "entityId=" + entityId
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", yaw=" + yaw
                + ", pitch=" + pitch
                + ", roll=" + roll
                + ", itemStack=" + itemStack
                + '}';
    }
}
