package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.CreativeItemGetPacket;

public class CreativeItemGetPacketData extends Packet<CreativeItemGetPacket> {

    private short slotId;
    private BetaItemStack itemStack;

    public CreativeItemGetPacketData(short slotId, BetaItemStack itemStack) {
        this.slotId = slotId;
        this.itemStack = itemStack;
    }

    public short getSlotId() {
        return slotId;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public Class<CreativeItemGetPacket> getPacketClass() {
        return CreativeItemGetPacket.class;
    }

    @Override
    public String toString() {
        return "CreativeItemGetPacketData{"
                + "slotId=" + slotId
                + ", itemStack=" + itemStack
                + '}';
    }
}
