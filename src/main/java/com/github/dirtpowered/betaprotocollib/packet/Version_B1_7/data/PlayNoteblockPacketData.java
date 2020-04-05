package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayNoteblockPacket;

public class PlayNoteblockPacketData extends Packet {

    private int x;
    private int y;
    private int z;
    private int instrumentType;
    private int pitch;

    public PlayNoteblockPacketData(int x, int y, int z, int instrumentType, int pitch) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.instrumentType = instrumentType;
        this.pitch = pitch;
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

    public int getInstrumentType() {
        return instrumentType;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) PlayNoteblockPacket.class;
    }
}
