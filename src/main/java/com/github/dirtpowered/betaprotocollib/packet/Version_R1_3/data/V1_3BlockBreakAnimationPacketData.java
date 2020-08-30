package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.BlockBreakAnimationPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3BlockBreakAnimationPacketData extends Packet<BlockBreakAnimationPacket> {
    private int playerId;
    private int x;
    private int y;
    private int z;
    private int stage;

    @Override
    public Class<BlockBreakAnimationPacket> getPacketClass() {
        return BlockBreakAnimationPacket.class;
    }
}
