package com.github.dirtpowered.betaprotocollib;

import com.github.dirtpowered.betaprotocollib.packet.*;
import com.github.dirtpowered.betaprotocollib.registry.PacketRegistry;

public class BetaLib {
    private static PacketRegistry registry;

    public static void inject() {
        registry = new PacketRegistry();

        //register packets
        registry.registerPacket(0x00, KeepAlivePacket.class);
        registry.registerPacket(0x01, LoginPacket.class);
        registry.registerPacket(0x02, HandshakePacket.class);
        registry.registerPacket(0x03, ChatPacket.class);
        registry.registerPacket(0x04, UpdateTimePacket.class);
        registry.registerPacket(0x06, SpawnPositionPacket.class);
        registry.registerPacket(0x08, UpdateHealthPacket.class);
        registry.registerPacket(0x09, RespawnPacket.class);
        registry.registerPacket(0xFF, KickDisconnectPacket.class);
        registry.registerPacket(0x18, MobSpawnPacket.class);
        registry.registerPacket(0x32, PreChunkPacket.class);
        registry.registerPacket(0x35, BlockChangePacket.class);
        registry.registerPacket(0x12, AnimationPacket.class);
        registry.registerPacket(0x14, NamedEntitySpawnPacket.class);
        registry.registerPacket(0x47, ThunderboltPacket.class);
        registry.registerPacket(0x13, EntityActionPacket.class);
        registry.registerPacket(0x10, BlockItemSwitchPacket.class);
        registry.registerPacket(0x05, PlayerInventoryPacket.class);
        registry.registerPacket(0x67, SetSlotPacket.class);
        registry.registerPacket(0x0E, BlockDigPacket.class);
        registry.registerPacket(0x33, MapChunkPacket.class);
        registry.registerPacket(0x1C, EntityVelocityPacket.class);
        registry.registerPacket(0x0F, BlockPlacePacket.class);
        registry.registerPacket(0x46, BedAndWeatherPacket.class);
        registry.registerPacket(0x3D, SoundEffectPacket.class);
        registry.registerPacket(0x3C, ExplosionPacket.class);
        registry.registerPacket(0x65, CloseWindowPacket.class);
        registry.registerPacket(0x64, OpenWindowPacket.class);
        registry.registerPacket(0x68, WindowItemsPacket.class);
        registry.registerPacket(0x66, WindowClickPacket.class);
        registry.registerPacket(0x6A, TransactionPacket.class);
        registry.registerPacket(0x82, UpdateSignPacket.class);
        registry.registerPacket(0x0C, PlayerLookPacket.class);
        registry.registerPacket(0x0A, FlyingPacket.class);
        registry.registerPacket(0x0B, PlayerPositionPacket.class);
        registry.registerPacket(0x0D, PlayerLookMovePacket.class);
        registry.registerPacket(0x20, EntityLookPacket.class);
        registry.registerPacket(0x21, EntityMoveLookPacket.class);
        registry.registerPacket(0x22, EntityTeleportPacket.class);
        registry.registerPacket(0x1F, EntityPositionPacket.class);
        registry.registerPacket(0x1D, EntityDestroyPacket.class);
        registry.registerPacket(0x05, EntityEquipmentPacket.class);
        registry.registerPacket(0x26, EntityStatusPacket.class);
        registry.registerPacket(0x07, UseEntityPacket.class);
        registry.registerPacket(0x15, PickupSpawnPacket.class);
        registry.registerPacket(0x16, CollectPacket.class);
        registry.registerPacket(0x17, VehicleSpawnPacket.class);
        registry.registerPacket(0x27, AttachEntityPacket.class);
    }

    public static PacketRegistry getRegistry() {
        return registry;
    }
}
