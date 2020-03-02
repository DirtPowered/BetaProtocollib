package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.PlayerPositionPacket;

public class PlayerPositionPacketData extends Packet {

    private double x;
    private double y;
    private double z;
    private double stance;
    private boolean onGround;

    public PlayerPositionPacketData(double x, double y, double z, double stance, boolean onGround) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.stance = stance;
        this.onGround = onGround;
    }

    public boolean isOnGround() {
        return onGround;
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

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PlayerPositionPacket.class;
    }
}
