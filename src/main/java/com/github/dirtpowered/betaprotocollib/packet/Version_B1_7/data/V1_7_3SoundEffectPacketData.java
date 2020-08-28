package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SoundEffectPacket;

public class V1_7_3SoundEffectPacketData extends Packet<SoundEffectPacket> {

    private int soundType;
    private int x;
    private int y;
    private int z;
    private int data;

    public V1_7_3SoundEffectPacketData(int soundType, int x, int y, int z, int data) {
        this.soundType = soundType;
        this.x = x;
        this.y = y;
        this.z = z;
        this.data = data;
    }

    public int getSoundType() {
        return soundType;
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

    public int getData() {
        return data;
    }

    @Override
    public Class<SoundEffectPacket> getPacketClass() {
        return SoundEffectPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3SoundEffectPacketData{"
                + "soundType=" + soundType
                + ", x=" + x
                + ", y=" + y
                + ", z=" + z
                + ", data=" + data
                + '}';
    }
}
