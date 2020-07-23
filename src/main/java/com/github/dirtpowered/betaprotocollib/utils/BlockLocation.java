package com.github.dirtpowered.betaprotocollib.utils;

import java.util.Objects;

public class BlockLocation {

    private int x;
    private int y;
    private int z;

    public BlockLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double distanceTo(Location p2) {
        return Math.sqrt(Math.pow(p2.getX() - this.getX(), 2) + Math.pow(p2.getY() - this.getY(), 2) + Math.pow(p2.getZ() - this.getZ(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockLocation that = (BlockLocation) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "BlockLocation [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
