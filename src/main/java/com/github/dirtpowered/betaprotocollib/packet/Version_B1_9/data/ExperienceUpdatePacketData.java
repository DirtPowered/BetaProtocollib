package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.ExperienceUpdatePacket;

public class ExperienceUpdatePacketData extends Packet<ExperienceUpdatePacket> {
    private float progress;
    private short level;
    private short totalExperience;

    public ExperienceUpdatePacketData(float progress, short level, short totalExperience) {
        this.progress = progress;
        this.level = level;
        this.totalExperience = totalExperience;
    }

    public float getProgress() {
        return progress;
    }

    public short getLevel() {
        return level;
    }

    public short getTotalExperience() {
        return totalExperience;
    }

    @Override
    public Class<ExperienceUpdatePacket> getPacketClass() {
        return ExperienceUpdatePacket.class;
    }

    @Override
    public String toString() {
        return "ExperienceUpdatePacketData{"
                + "progress=" + progress
                + ", level=" + level
                + ", totalExperience=" + totalExperience
                + '}';
    }
}
