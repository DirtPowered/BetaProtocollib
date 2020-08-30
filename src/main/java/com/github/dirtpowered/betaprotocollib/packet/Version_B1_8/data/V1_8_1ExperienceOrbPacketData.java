package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceOrbPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1ExperienceOrbPacketData extends Packet<ExperienceOrbPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private short count;

    @Override
    public Class<ExperienceOrbPacket> getPacketClass() {
        return ExperienceOrbPacket.class;
    }
}
