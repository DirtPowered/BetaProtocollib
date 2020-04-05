package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceUpdatePacket;

public class ExperienceUpdatePacketData extends Packet {
    private int progress;
    private int level;
    private short totalExperience;

    public ExperienceUpdatePacketData(int progress, int level, short totalExperience) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) ExperienceUpdatePacket.class;
    }
}
