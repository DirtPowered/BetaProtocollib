package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CloseWindowPacket;

public class CloseWindowPacketData extends Packet {

    private int windowId;

    public CloseWindowPacketData(int windowId) {
        this.windowId = windowId;
    }

    public int getWindowId() {
        return windowId;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) CloseWindowPacket.class;
    }
}
