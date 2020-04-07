package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockDigPacket;

public class BlockDigPacketData extends Packet<BlockDigPacket> {
    private int x;
    private int y;
    private int z;
    private int face;
    private int status;

    public BlockDigPacketData(int x, int y, int z, int face, int status) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.face = face;
        this.status = status;
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

    public int getFace() {
        return face;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public Class<BlockDigPacket> getPacketClass() {
        return BlockDigPacket.class;
    }

    @Override
    public String toString() {
        return "BlockDigPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", face=" + face
                + ", status=" + status
                + '}';
    }
}
