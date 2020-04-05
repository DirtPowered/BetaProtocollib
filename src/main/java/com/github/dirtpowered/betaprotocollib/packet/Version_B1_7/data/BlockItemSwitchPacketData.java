package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockItemSwitchPacket;

public class BlockItemSwitchPacketData extends Packet {

    private int slot;

    public BlockItemSwitchPacketData(int slot) {
        this.slot = slot;
    }

    public int getSlot() {
        return slot;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) BlockItemSwitchPacket.class;
    }
}
