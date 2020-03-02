package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.BlockItemSwitchPacket;

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
