package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.WindowItemsPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3WindowItemsPacketData extends Packet<WindowItemsPacket> {
    private int windowId;
    private BetaItemStack[] itemStacks;

    @Override
    public Class<WindowItemsPacket> getPacketClass() {
        return WindowItemsPacket.class;
    }
}
