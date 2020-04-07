package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookPacket;

public class PlayerLookPacketData extends Packet<PlayerLookPacket> {

    private float yaw;
    private float pitch;
    private boolean onGround;

    public PlayerLookPacketData(float yaw, float pitch, boolean onGround) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    @Override
    public Class<PlayerLookPacket> getPacketClass() {
        return PlayerLookPacket.class;
    }

    @Override
    public String toString() {
        return "PlayerLookPacketData{"
                + "yaw=" + yaw
                + ", pitch=" + pitch
                + ", onGround=" + onGround
                + '}';
    }
}
