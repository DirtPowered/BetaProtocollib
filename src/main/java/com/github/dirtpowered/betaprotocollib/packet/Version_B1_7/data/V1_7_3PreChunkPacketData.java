package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PreChunkPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3PreChunkPacketData extends Packet<PreChunkPacket> {
    private int x;
    private int z;
    private boolean full;

    @Override
    public Class<PreChunkPacket> getPacketClass() {
        return PreChunkPacket.class;
    }
}
