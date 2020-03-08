package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.WindowItemsPacket;

public class WindowItemsPacketData extends Packet {

    private int windowId;
    private BetaItemStack[] itemStacks;

    public WindowItemsPacketData(int windowId, BetaItemStack[] itemstacks) {
        this.windowId = windowId;
        this.itemStacks = itemstacks.clone();
    }

    public int getWindowId() {
        return windowId;
    }

    public BetaItemStack[] getItemStacks() {
        return itemStacks.clone();
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) WindowItemsPacket.class;
    }
}
