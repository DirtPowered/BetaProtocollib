package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.PlayerAbilitiesPacket;

public class V1_3PlayerAbilitiesPacketData extends Packet<PlayerAbilitiesPacket> {
    private boolean damageDisabled;
    private boolean flying;
    private boolean flyingAllowed;
    private boolean creativeMode;
    private float flyingSpeed;
    private float walkingSpeed;

    public V1_3PlayerAbilitiesPacketData(boolean damageDisabled, boolean flying, boolean flyingAllowed,
                                         boolean creativeMode, float flyingSpeed, float walkingSpeed) {
        this.damageDisabled = damageDisabled;
        this.flying = flying;
        this.flyingAllowed = flyingAllowed;
        this.creativeMode = creativeMode;
        this.flyingSpeed = flyingSpeed;
        this.walkingSpeed = walkingSpeed;
    }

    public boolean isDamageDisabled() {
        return damageDisabled;
    }

    public boolean isFlying() {
        return flying;
    }

    public boolean isFlyingAllowed() {
        return flyingAllowed;
    }

    public boolean isCreativeMode() {
        return creativeMode;
    }

    public float getWalkingSpeed() {
        return walkingSpeed;
    }

    public float getFlyingSpeed() {
        return flyingSpeed;
    }

    @Override
    public Class<PlayerAbilitiesPacket> getPacketClass() {
        return PlayerAbilitiesPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3PlayerAbilitiesPacketData{"
                + "damageDisabled=" + damageDisabled
                + ", flying=" + flying
                + ", flyingAllowed=" + flyingAllowed
                + ", creativeMode=" + creativeMode
                + ", walkingSpeed=" + walkingSpeed
                + ", flyingSpeed=" + flyingSpeed
                + '}';
    }
}
