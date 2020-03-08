package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.SetSlotPacket;

public class SetSlotPacketData extends Packet {

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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) SetSlotPacket.class;
    }
}
