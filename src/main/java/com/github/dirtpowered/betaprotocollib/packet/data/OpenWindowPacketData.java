package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.OpenWindowPacket;

public class OpenWindowPacketData extends Packet {
    private int windowId;
    private int inventoryType;
    private String windowTitle;
    private int slotsCount;

    public OpenWindowPacketData(int windowId, int inventoryType, String windowTitle, int slotsCount) {
        this.windowId = windowId;
        this.inventoryType = inventoryType;
        this.windowTitle = windowTitle;
        this.slotsCount = slotsCount;
    }

    public int getWindowId() {
        return windowId;
    }

    public int getInventoryType() {
        return inventoryType;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public int getSlotsCount() {
        return slotsCount;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) OpenWindowPacket.class;
    }
}
