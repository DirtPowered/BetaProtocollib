package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockPlacePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3BlockPlacePacketData extends Packet<BlockPlacePacket> {
    private int x;
    private int y;
    private int z;
    private int direction;
    private BetaItemStack betaItemStack;

    @Override
    public Class<BlockPlacePacket> getPacketClass() {
        return BlockPlacePacket.class;
    }
}
