package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.WindowItemsPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3WindowItemsPacketData extends Packet<WindowItemsPacket> {
    private int windowId;
    private BetaItemStack[] itemStacks;

    @Override
    public Class<WindowItemsPacket> getPacketClass() {
        return WindowItemsPacket.class;
    }
}
