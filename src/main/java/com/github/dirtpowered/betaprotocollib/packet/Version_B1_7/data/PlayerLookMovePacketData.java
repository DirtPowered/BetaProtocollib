package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookMovePacket;

public class PlayerLookMovePacketData extends Packet {

    private double x;
    private double y;
    private double z;
    private double stance;
    private float yaw;
    private float pitch;
    private boolean onGround;
    private boolean moving;
    private boolean rotating;

    public PlayerLookMovePacketData(double x, double y, double stance, double z, float yaw, float pitch, boolean onGround) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PlayerLookMovePacket.class;
    }
}
