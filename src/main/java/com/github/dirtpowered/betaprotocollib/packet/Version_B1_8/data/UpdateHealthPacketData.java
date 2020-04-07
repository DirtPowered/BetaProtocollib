package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.UpdateHealthPacket;

public class UpdateHealthPacketData extends Packet<UpdateHealthPacket> {

    private int health;
    private int food;
    private float saturation;

    public UpdateHealthPacketData(int health, int food, float saturation) {
        this.health = health;
        this.food = food;
        this.saturation = saturation;
    }

    public int getHealth() {
        return health;
    }

    public int getFood() {
        return food;
    }

    public float getSaturation() {
        return saturation;
    }

    @Override
    public Class<UpdateHealthPacket> getPacketClass() {
        return UpdateHealthPacket.class;
    }

    @Override
    public String toString() {
        return "UpdateHealthPacketData{"
                + "health=" + health
                + ", food=" + food
                + ", saturation=" + saturation
                + '}';
    }
}
