package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.WindowItemsPacket;

import java.util.Arrays;

public class V1_7_3WindowItemsPacketData extends Packet<WindowItemsPacket> {

    private int windowId;
    private BetaItemStack[] itemStacks;

    public V1_7_3WindowItemsPacketData(int windowId, BetaItemStack[] itemstacks) {
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
    public Class<WindowItemsPacket> getPacketClass() {
        return WindowItemsPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3WindowItemsPacketData{"
                + "windowId=" + windowId
                + ", itemStacks=" + Arrays.toString(itemStacks)
                + '}';
    }
}
