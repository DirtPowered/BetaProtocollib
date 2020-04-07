package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockItemSwitchPacket;

public class BlockItemSwitchPacketData extends Packet<BlockItemSwitchPacket> {

    private int slot;

    public BlockItemSwitchPacketData(int slot) {
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
        return "BlockItemSwitchPacketData{"
                + "slot=" + slot
                + '}';
    }
}
