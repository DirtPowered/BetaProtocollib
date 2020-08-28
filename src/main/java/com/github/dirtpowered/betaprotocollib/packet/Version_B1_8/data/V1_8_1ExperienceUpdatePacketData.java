package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceUpdatePacket;

public class V1_8_1ExperienceUpdatePacketData extends Packet<ExperienceUpdatePacket> {
    private int progress;
    private int level;
    private short totalExperience;

    public V1_8_1ExperienceUpdatePacketData(int progress, int level, short totalExperience) {
        this.progress = progress;
        this.level = level;
        this.totalExperience = totalExperience;
    }

    public int getProgress() {
        return progress;
    }

    public int getLevel() {
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
        return "V1_8_1ExperienceUpdatePacketData{"
                + "progress=" + progress
                + ", level=" + level
                + ", totalExperience=" + totalExperience
                + '}';
    }
}
