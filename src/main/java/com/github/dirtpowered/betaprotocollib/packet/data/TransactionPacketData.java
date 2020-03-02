package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.TransactionPacket;

public class TransactionPacketData extends Packet {

    private int windowId;
    private int shortWindowId;
    private boolean accepted;

    public TransactionPacketData(int windowId, int shortWindowId, boolean accepted) {
        this.windowId = windowId;
        this.shortWindowId = shortWindowId;
        this.accepted = accepted;
    }


    public int getWindowId() {
        return windowId;
    }

    public int getShortWindowId() {
        return shortWindowId;
    }

    public boolean isAccepted() {
        return accepted;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) TransactionPacket.class;
    }
}
