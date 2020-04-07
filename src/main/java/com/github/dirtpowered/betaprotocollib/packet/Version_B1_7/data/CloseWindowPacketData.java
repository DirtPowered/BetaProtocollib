package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CloseWindowPacket;

public class CloseWindowPacketData extends Packet<CloseWindowPacket> {

    private int windowId;

    public CloseWindowPacketData(int windowId) {
        this.windowId = windowId;
    }

    public int getWindowId() {
        return windowId;
    }

    @Override
    public Class<CloseWindowPacket> getPacketClass() {
        return CloseWindowPacket.class;
    }

    @Override
    public String toString() {
        return "CloseWindowPacketData{"
                + "windowId=" + windowId
                + '}';
    }
}
