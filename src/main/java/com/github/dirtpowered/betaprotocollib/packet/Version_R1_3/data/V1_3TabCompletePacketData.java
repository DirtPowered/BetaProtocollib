package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.TabCompletePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3TabCompletePacketData extends Packet<TabCompletePacket> {
    private String text;

    @Override
    public Class<TabCompletePacket> getPacketClass() {
        return TabCompletePacket.class;
    }
}
