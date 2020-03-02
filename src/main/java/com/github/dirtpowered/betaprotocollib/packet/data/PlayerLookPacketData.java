package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.PlayerLookPacket;

public class PlayerLookPacketData extends Packet {

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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PlayerLookPacket.class;
    }
}
