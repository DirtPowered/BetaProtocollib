package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockItemSwitchPacket;

public class V1_7_3BlockItemSwitchPacketData extends Packet<BlockItemSwitchPacket> {

    private int slot;

    public V1_7_3BlockItemSwitchPacketData(int slot) {
        this.slot = slot;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public Class<BlockItemSwitchPacket> getPacketClass() {
        return BlockItemSwitchPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3BlockItemSwitchPacketData{"
                + "slot=" + slot
                + '}';
    }
}
