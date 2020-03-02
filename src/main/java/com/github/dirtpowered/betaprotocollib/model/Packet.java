package com.github.dirtpowered.betaprotocollib.model;

public abstract class Packet {
    public abstract <T> Class<T> getPacketClass();
}
