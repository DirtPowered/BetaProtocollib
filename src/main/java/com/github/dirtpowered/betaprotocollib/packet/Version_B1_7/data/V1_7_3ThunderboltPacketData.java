package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ThunderboltPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3ThunderboltPacketData extends Packet<ThunderboltPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private int lighting;

    @Override
    public Class<ThunderboltPacket> getPacketClass() {
        return ThunderboltPacket.class;
    }
}
