package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.VehicleSpawnPacket;

public class VehicleSpawnPacketData extends Packet {

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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) VehicleSpawnPacket.class;
    }
}
