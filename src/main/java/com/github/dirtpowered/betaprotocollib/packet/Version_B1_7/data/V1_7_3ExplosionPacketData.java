package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ExplosionPacket;
import com.github.dirtpowered.betaprotocollib.utils.BlockLocation;

import java.util.List;

public class V1_7_3ExplosionPacketData extends Packet<ExplosionPacket> {

    private double x;
    private double y;
    private double z;
    private float explosionSize;
    private List<BlockLocation> destroyedBlockPositions;

    public V1_7_3ExplosionPacketData(double x, double y, double z, float explosionSize, List<BlockLocation> destroyedBlockPositions) {
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

    public List<BlockLocation> getDestroyedBlockPositions() {
        return destroyedBlockPositions;
    }

    @Override
    public Class<ExplosionPacket> getPacketClass() {
        return ExplosionPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3ExplosionPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", explosionSize=" + explosionSize
                + ", destroyedBlockPositions=" + destroyedBlockPositions
                + '}';
    }
}
