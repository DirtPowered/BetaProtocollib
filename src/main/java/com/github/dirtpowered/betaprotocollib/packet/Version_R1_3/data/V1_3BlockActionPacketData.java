package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.BlockActionPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3BlockActionPacketData extends Packet<BlockActionPacket> {
    private int x;
    private int y;
    private int z;
    private int actionType;
    private int pitch;
    private int blockId;

    @Override
    public Class<BlockActionPacket> getPacketClass() {
        return BlockActionPacket.class;
    }
}
