package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.ExplosionPacket;
import com.github.dirtpowered.betaprotocollib.utils.Location;

import java.util.List;

public class ExplosionPacketData extends Packet {

    private double x;
    private double y;
    private double z;
    private float explosionSize;
    private List<Location> destroyedBlockPositions;

    public ExplosionPacketData(double x, double y, double z, float explosionSize, List<Location> destroyedBlockPositions) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.explosionSize = explosionSize;
        this.destroyedBlockPositions = destroyedBlockPositions;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public float getExplosionSize() {
        return explosionSize;
    }

    public List<Location> getDestroyedBlockPositions() {
        return destroyedBlockPositions;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) ExplosionPacket.class;
    }
}
