package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateHealthPacket;

public class UpdateHealthPacketData extends Packet<UpdateHealthPacket> {

    private int health;

    public UpdateHealthPacketData(int health) {
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
        return "UpdateHealthPacketData{"
                + "health=" + health
                + '}';
    }
}
