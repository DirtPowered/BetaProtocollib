package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateHealthPacket;

public class V1_7_3UpdateHealthPacketData extends Packet<UpdateHealthPacket> {

    private int health;

    public V1_7_3UpdateHealthPacketData(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public Class<UpdateHealthPacket> getPacketClass() {
        return UpdateHealthPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3UpdateHealthPacketData{"
                + "health=" + health
                + '}';
    }
}
