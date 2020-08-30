package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceUpdatePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1ExperienceUpdatePacketData extends Packet<ExperienceUpdatePacket> {
    private int progress;
    private int level;
    private short totalExperience;

    @Override
    public Class<ExperienceUpdatePacket> getPacketClass() {
        return ExperienceUpdatePacket.class;
    }
}
