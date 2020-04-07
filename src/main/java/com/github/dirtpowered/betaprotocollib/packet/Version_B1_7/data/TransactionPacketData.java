package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.TransactionPacket;

public class TransactionPacketData extends Packet<TransactionPacket> {

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
    public Class<TransactionPacket> getPacketClass() {
        return TransactionPacket.class;
    }

    @Override
    public String toString() {
        return "TransactionPacketData{"
                + "windowId=" + windowId
                + ", shortWindowId=" + shortWindowId
                + ", accepted=" + accepted
                + '}';
    }
}
