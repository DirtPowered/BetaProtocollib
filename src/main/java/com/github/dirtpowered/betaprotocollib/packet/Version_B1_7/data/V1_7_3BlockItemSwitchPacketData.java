package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockItemSwitchPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3BlockItemSwitchPacketData extends Packet<BlockItemSwitchPacket> {
    private int slot;

    @Override
    public Class<BlockItemSwitchPacket> getPacketClass() {
        return BlockItemSwitchPacket.class;
    }
}
