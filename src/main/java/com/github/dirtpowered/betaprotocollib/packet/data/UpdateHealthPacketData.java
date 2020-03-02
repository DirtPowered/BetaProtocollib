package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.UpdateHealthPacket;

public class UpdateHealthPacketData extends Packet {

    private int health;

    public UpdateHealthPacketData(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) UpdateHealthPacket.class;
    }
}
