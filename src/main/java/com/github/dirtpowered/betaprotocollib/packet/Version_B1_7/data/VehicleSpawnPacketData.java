package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.VehicleSpawnPacket;

public class VehicleSpawnPacketData extends Packet<VehicleSpawnPacket> {

    private int entityId;
    private int type;
    private int x;
    private int y;
    private int z;
    private int velocityX;
    private int velocityY;
    private int velocityZ;
    private int velocity;

    public VehicleSpawnPacketData(int entityId, int type, int x, int y, int z, int velocity, int velocityX, int velocityY, int velocityZ) {
        this.entityId = entityId;
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
        this.velocity = velocity;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;
    }

    public int getVelocity() {
        return velocity;
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

    public int getEntityId() {
        return entityId;
    }

    public int getType() {
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

    @Override
    public Class<VehicleSpawnPacket> getPacketClass() {
        return VehicleSpawnPacket.class;
    }

    @Override
    public String toString() {
        return "VehicleSpawnPacketData{"
                + "entityId=" + entityId
                + ", type=" + type
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", velocityX=" + velocityX
                + ", velocityY=" + velocityY
                + ", velocityZ=" + velocityZ
                + ", velocity=" + velocity
                + '}';
    }
}
