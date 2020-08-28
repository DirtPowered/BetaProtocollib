package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookMovePacket;

public class V1_7_3PlayerLookMovePacketData extends Packet<PlayerLookMovePacket> {

    private double x;
    private double y;
    private double z;
    private double stance;
    private float yaw;
    private float pitch;
    private boolean onGround;
    private boolean moving;
    private boolean rotating;

    public V1_7_3PlayerLookMovePacketData(double x, double y, double stance, double z, float yaw, float pitch, boolean onGround) {
        this.x = x;
        this.y = y;
        this.stance = stance;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
        this.rotating = true;
        this.moving = true;
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

    public double getStance() {
        return stance;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public boolean isMoving() {
        return moving;
    }

    public boolean isRotating() {
        return rotating;
    }

    @Override
    public Class<PlayerLookMovePacket> getPacketClass() {
        return PlayerLookMovePacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3PlayerLookMovePacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", stance=" + stance
                + ", yaw=" + yaw
                + ", pitch=" + pitch
                + ", onGround=" + onGround
                + ", moving=" + moving
                + ", rotating=" + rotating
                + '}';
    }
}
