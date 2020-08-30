package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.SetSlotPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_9SetSlotPacketData extends Packet<SetSlotPacket> {
    private int windowId;
    private int itemSlot;
    private BetaItemStack itemStack;

    @Override
    public Class<SetSlotPacket> getPacketClass() {
        return SetSlotPacket.class;
    }
}
