package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.StatisticsPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3StatisticsPacketData extends Packet<StatisticsPacket> {
    private int statId;
    private int data;

    @Override
    public Class<StatisticsPacket> getPacketClass() {
        return StatisticsPacket.class;
    }
}
