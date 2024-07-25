package com.github.dirtpowered.betaprotocollib.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private double x;
    private double y;
    private double z;
    private float yaw;
    private float pitch;

    public double distanceTo(Location p2) {
        return Math.sqrt(Math.pow(p2.getX() - this.getX(), 2) + Math.pow(p2.getY() - this.getY(), 2) + Math.pow(p2.getZ() - this.getZ(), 2));
    }
}