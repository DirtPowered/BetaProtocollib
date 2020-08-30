package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockChangePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3BlockChangePacketData extends Packet<BlockChangePacket> {
    private int xPosition;
    private int yPosition;
    private int zPosition;
    private int type;
    private int metadata;

    @Override
    public Class<BlockChangePacket> getPacketClass() {
        return BlockChangePacket.class;
    }
}
