package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.CloseWindowPacket;

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
