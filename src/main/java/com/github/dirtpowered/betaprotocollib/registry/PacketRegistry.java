package com.github.dirtpowered.betaprotocollib.registry;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;

import java.util.HashMap;
import java.util.Map;

public class PacketRegistry {
    private final Map<Integer, Class<? extends AbstractPacket>> packets = new HashMap<>();

    protected void registerPacket(int packetID, final Class<? extends AbstractPacket> clazz) {
        packets.put(packetID, clazz);
    }

    public Class<? extends AbstractPacket> getFromId(final int packetId) {
        return packets.get(packetId);
    }

    public boolean hasId(int packetId) {
        return packets.containsKey(packetId);
    }
}
