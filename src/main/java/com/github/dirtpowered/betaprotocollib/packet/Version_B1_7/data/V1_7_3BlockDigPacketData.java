package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockDigPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3BlockDigPacketData extends Packet<BlockDigPacket> {
    private int x;
    private int y;
    private int z;
    private int face;
    private int status;

    @Override
    public Class<BlockDigPacket> getPacketClass() {
        return BlockDigPacket.class;
    }
}
