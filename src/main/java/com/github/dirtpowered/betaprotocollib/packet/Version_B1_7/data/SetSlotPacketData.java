package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SetSlotPacket;

public class SetSlotPacketData extends Packet<SetSlotPacket> {

    private int windowId;
    private int itemSlot;
    private BetaItemStack itemStack;

    public SetSlotPacketData(int windowId, int itemSlot, BetaItemStack itemStack) {
        this.windowId = windowId;
        this.itemSlot = itemSlot;
        this.itemStack = itemStack;
    }

    public int getWindowId() {
        return windowId;
    }

    public int getItemSlot() {
        return itemSlot;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public Class<SetSlotPacket> getPacketClass() {
        return SetSlotPacket.class;
    }

    @Override
    public String toString() {
        return "SetSlotPacketData{"
                + "windowId=" + windowId
                + ", itemSlot=" + itemSlot
                + ", itemStack=" + itemStack
                + '}';
    }
}
