package com.github.dirtpowered.betaprotocollib.packet.protocol;

import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AnimationPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AttachEntityPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockChangePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockDigPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockItemSwitchPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ChatPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CloseWindowPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CollectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityActionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityDestroyPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityEquipmentPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityLookPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityMetadataPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityMoveLookPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPositionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityStatusPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityTeleportPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityVelocityPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ExplosionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.FlyingPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.HandshakePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.KickDisconnectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapDataPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.NamedEntitySpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PaintingPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PickupSpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayNoteblockPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookMovePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerPositionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PreChunkPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SleepPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SoundEffectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SpawnPositionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.StatisticsPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ThunderboltPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.TransactionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateProgressPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateSignPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateTimePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UseEntityPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.VehicleSpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.BedAndWeatherPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.EntityEffectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceOrbPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.KeepAlivePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.OpenWindowPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.PlayerListItemPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RemoveEntityEffectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ServerListPingPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.UpdateHealthPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.BlockPlacePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.CreativeItemGetPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.EnchantItemPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.ExperienceUpdatePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.SetSlotPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.WindowClickPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.WindowItemsPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.CustomPayloadPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.EntityHeadLookPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.LoginPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MapChunkPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MobSpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MultiBlockChangePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.PlayerAbilitiesPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.RespawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.UpdateTileEntityPacket;
import com.github.dirtpowered.betaprotocollib.registry.PacketRegistry;

public class Protocol_R_1_2 extends PacketRegistry {

    public Protocol_R_1_2() {
        registerPacket(0x00, KeepAlivePacket.class);
        registerPacket(0x01, LoginPacket.class);
        registerPacket(0x02, HandshakePacket.class);
        registerPacket(0x03, ChatPacket.class);
        registerPacket(0x04, UpdateTimePacket.class);
        registerPacket(0x06, SpawnPositionPacket.class);
        registerPacket(0x08, UpdateHealthPacket.class);
        registerPacket(0x09, RespawnPacket.class);
        registerPacket(0xFF, KickDisconnectPacket.class);
        registerPacket(0x18, MobSpawnPacket.class);
        registerPacket(0x11, SleepPacket.class);
        registerPacket(0x19, PaintingPacket.class);
        registerPacket(0x32, PreChunkPacket.class);
        registerPacket(0x35, BlockChangePacket.class);
        registerPacket(0x34, MultiBlockChangePacket.class);
        registerPacket(0x36, PlayNoteblockPacket.class);
        registerPacket(0x12, AnimationPacket.class);
        registerPacket(0x14, NamedEntitySpawnPacket.class);
        registerPacket(0x47, ThunderboltPacket.class);
        registerPacket(0x13, EntityActionPacket.class);
        registerPacket(0x10, BlockItemSwitchPacket.class);
        registerPacket(0x67, SetSlotPacket.class);
        registerPacket(0x0E, BlockDigPacket.class);
        registerPacket(0x33, MapChunkPacket.class);
        registerPacket(0x1C, EntityVelocityPacket.class);
        registerPacket(0x0F, BlockPlacePacket.class);
        registerPacket(0x46, BedAndWeatherPacket.class);
        registerPacket(0x3D, SoundEffectPacket.class);
        registerPacket(0x3C, ExplosionPacket.class);
        registerPacket(0x65, CloseWindowPacket.class);
        registerPacket(0x64, OpenWindowPacket.class);
        registerPacket(0x68, WindowItemsPacket.class);
        registerPacket(0x66, WindowClickPacket.class);
        registerPacket(0x6A, TransactionPacket.class);
        registerPacket(0x82, UpdateSignPacket.class);
        registerPacket(0x0C, PlayerLookPacket.class);
        registerPacket(0x0A, FlyingPacket.class);
        registerPacket(0x0B, PlayerPositionPacket.class);
        registerPacket(0x0D, PlayerLookMovePacket.class);
        registerPacket(0x20, EntityLookPacket.class);
        registerPacket(0x21, EntityMoveLookPacket.class);
        registerPacket(0x22, EntityTeleportPacket.class);
        registerPacket(0x23, EntityHeadLookPacket.class);
        registerPacket(0x1F, EntityPositionPacket.class);
        registerPacket(0x69, UpdateProgressPacket.class);
        registerPacket(0x1D, EntityDestroyPacket.class);
        registerPacket(0x05, EntityEquipmentPacket.class);
        registerPacket(0x26, EntityStatusPacket.class);
        registerPacket(0x07, UseEntityPacket.class);
        registerPacket(0x15, PickupSpawnPacket.class);
        registerPacket(0x16, CollectPacket.class);
        registerPacket(0x17, VehicleSpawnPacket.class);
        registerPacket(0x27, AttachEntityPacket.class);
        registerPacket(0x28, EntityMetadataPacket.class);
        registerPacket(0x1E, EntityPacket.class);
        registerPacket(0xC8, StatisticsPacket.class);
        registerPacket(0x83, MapDataPacket.class);
        registerPacket(0x84, UpdateTileEntityPacket.class);
        registerPacket(0xC9, PlayerListItemPacket.class);
        registerPacket(0x29, EntityEffectPacket.class);
        registerPacket(0x2A, RemoveEntityEffectPacket.class);
        registerPacket(0x2B, ExperienceUpdatePacket.class);
        registerPacket(0x1A, ExperienceOrbPacket.class);
        registerPacket(0x6B, CreativeItemGetPacket.class);
        registerPacket(0xFA, CustomPayloadPacket.class);
        registerPacket(0xCA, PlayerAbilitiesPacket.class);
        registerPacket(0xFE, ServerListPingPacket.class);
        registerPacket(0x6C, EnchantItemPacket.class);
    }
}
