package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.UpdateSignPacket;

public class UpdateSignPacketData extends Packet {

    private int x;
    private int y;
    private int z;
    private String[] signLines;

    public UpdateSignPacketData(int x, int y, int z, String[] signLines) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.signLines = signLines.clone();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String[] getSignLines() {
        return signLines.clone();
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) UpdateSignPacket.class;
    }
}
