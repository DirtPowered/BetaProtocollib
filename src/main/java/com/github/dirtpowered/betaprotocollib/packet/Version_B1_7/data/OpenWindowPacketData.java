package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.OpenWindowPacket;

public class OpenWindowPacketData extends Packet<OpenWindowPacket> {
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
    public Class<OpenWindowPacket> getPacketClass() {
        return OpenWindowPacket.class;
    }

    @Override
    public String toString() {
        return "OpenWindowPacketData{"
                + "windowId=" + windowId
                + ", inventoryType=" + inventoryType
                + ", windowTitle='" + windowTitle + '\''
                + ", slotsCount=" + slotsCount
                + '}';
    }
}
