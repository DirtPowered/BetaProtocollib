package com.github.dirtpowered.betaprotocollib.model;

public abstract class Packet<T> {
    public abstract Class<T> getPacketClass();
}
