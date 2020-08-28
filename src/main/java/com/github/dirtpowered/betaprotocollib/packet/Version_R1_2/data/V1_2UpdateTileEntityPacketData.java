package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.UpdateTileEntityPacket;

public class V1_2UpdateTileEntityPacketData extends Packet<UpdateTileEntityPacket> {
    private int x;
    private int y;
    private int z;
    private int action;
    private int mobType;
    private int customData;
    private int customData2;

    public V1_2UpdateTileEntityPacketData(int x, int y, int z, int action, int mobType, int customData, int customData2) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.action = action;
        this.mobType = mobType;
        this.customData = customData;
        this.customData2 = customData2;
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

    public int getAction() {
        return action;
    }

    public int getMobType() {
        return mobType;
    }

    public int getCustomData() {
        return customData;
    }

    public int getCustomData2() {
        return customData2;
    }

    @Override
    public String toString() {
        return "V1_2UpdateTileEntityPacketData{"
                + "x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", action=" + action
                + ", mobType=" + mobType
                + ", customData=" + customData
                + ", customData2=" + customData2
                + '}';
    }

    @Override
    public Class<UpdateTileEntityPacket> getPacketClass() {
        return UpdateTileEntityPacket.class;
    }
}
