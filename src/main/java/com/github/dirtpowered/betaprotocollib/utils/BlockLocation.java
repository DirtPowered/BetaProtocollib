package com.github.dirtpowered.betaprotocollib.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlockLocation {
    private int x;
    private int y;
    private int z;

    public double distanceTo(Location p2) {
        return Math.sqrt(Math.pow(p2.getX() - this.getX(), 2) + Math.pow(p2.getY() - this.getY(), 2) + Math.pow(p2.getZ() - this.getZ(), 2));
    }
}
