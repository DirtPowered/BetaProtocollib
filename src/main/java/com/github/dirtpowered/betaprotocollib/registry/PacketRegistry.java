package com.github.dirtpowered.betaprotocollib.registry;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class PacketRegistry {
    private final Map<Class<? extends AbstractPacket<?>>, Supplier<AbstractPacket<?>>> classToSupplierCache = new ConcurrentHashMap<>();
    private final Map<Integer, Class<? extends AbstractPacket<?>>> packets = new ConcurrentHashMap<>();
    private final Map<Integer, Supplier<AbstractPacket<?>>> packetCache = new ConcurrentHashMap<>();

    public AbstractPacket<?> createOrGetInstance(int packetId) {
        return getFromCache(packetCache, packetId, "No packet registered for ID: ");
    }

    public void populateCache() {
        packets.forEach((id, clazz) -> {
            Supplier<AbstractPacket<?>> supplier = createSupplier(clazz);
            classToSupplierCache.put(clazz, supplier);
            packetCache.put((int) id, supplier);
        });
    }

    public boolean hasPacket(int packetId) {
        return packetCache.containsKey(packetId);
    }

    public AbstractPacket<?> getPacketInstance(Class<? extends AbstractPacket<?>> clazz) {
        return getFromCache(classToSupplierCache, clazz, "No packet registered for class: ");
    }

    private Supplier<AbstractPacket<?>> createSupplier(Class<? extends AbstractPacket<?>> clazz) {
        return () -> {
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate packet: " + clazz.getName(), e);
            }
        };
    }

    private <K, V> V getFromCache(Map<K, Supplier<V>> cache, K key, String errorMessage) {
        Supplier<V> supplier = cache.get(key);
        if (supplier == null) {
            throw new IllegalArgumentException(errorMessage + key);
        }
        return supplier.get();
    }

    protected void registerPacket(int packetId, final Class<? extends AbstractPacket<?>> clazz) {
        packets.put(packetId, clazz);
    }
}