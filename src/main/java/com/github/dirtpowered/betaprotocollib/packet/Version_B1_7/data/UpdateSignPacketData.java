package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateSignPacket;

import java.util.Arrays;

public class UpdateSignPacketData extends Packet<UpdateSignPacket> {

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
    public Class<UpdateSignPacket> getPacketClass() {
        return UpdateSignPacket.class;
    }

    @Override
    public String toString() {
        return "UpdateSignPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", signLines=" + Arrays.toString(signLines)
                + '}';
    }
}
