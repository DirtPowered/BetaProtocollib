/*
 * Copyright (c) 2020 Dirt Powered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.dirtpowered.betaprotocollib.packet.protocol;

import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AnimationPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AttachEntityPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockChangePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockDigPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockItemSwitchPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.BlockPlacePacket;
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
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapChunkPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapDataPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MobSpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MultiBlockChangePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.NamedEntitySpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PaintingPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PickupSpawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayNoteblockPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerInventoryPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookMovePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerPositionPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PreChunkPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SetSlotPacket;
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
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.WindowClickPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.WindowItemsPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.BedAndWeatherPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.EntityEffectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ExperienceOrbPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.KeepAlivePacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.LoginPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.OpenWindowPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.PlayerListItemPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RemoveEntityEffectPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RespawnPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.ServerListPingPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.UpdateHealthPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.CreativeItemGetPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.EnchantItemPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.ExperienceUpdatePacket;
import com.github.dirtpowered.betaprotocollib.registry.PacketRegistry;

public class Protocol_B1_9 {

    public Protocol_B1_9(PacketRegistry registry) {
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
        registry.registerPacket(0x11, SleepPacket.class);
        registry.registerPacket(0x19, PaintingPacket.class);
        registry.registerPacket(0x32, PreChunkPacket.class);
        registry.registerPacket(0x35, BlockChangePacket.class);
        registry.registerPacket(0x34, MultiBlockChangePacket.class);
        registry.registerPacket(0x36, PlayNoteblockPacket.class);
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
        registry.registerPacket(0x69, UpdateProgressPacket.class);
        registry.registerPacket(0x1D, EntityDestroyPacket.class);
        registry.registerPacket(0x05, EntityEquipmentPacket.class);
        registry.registerPacket(0x26, EntityStatusPacket.class);
        registry.registerPacket(0x07, UseEntityPacket.class);
        registry.registerPacket(0x15, PickupSpawnPacket.class);
        registry.registerPacket(0x16, CollectPacket.class);
        registry.registerPacket(0x17, VehicleSpawnPacket.class);
        registry.registerPacket(0x27, AttachEntityPacket.class);
        registry.registerPacket(0x28, EntityMetadataPacket.class);
        registry.registerPacket(0x1E, EntityPacket.class);
        registry.registerPacket(0xC8, StatisticsPacket.class);
        registry.registerPacket(0x83, MapDataPacket.class);
        registry.registerPacket(0xC9, PlayerListItemPacket.class);
        registry.registerPacket(0x29, EntityEffectPacket.class);
        registry.registerPacket(0x2A, RemoveEntityEffectPacket.class);
        registry.registerPacket(0x2B, ExperienceUpdatePacket.class);
        registry.registerPacket(0x1A, ExperienceOrbPacket.class);
        registry.registerPacket(0x6B, CreativeItemGetPacket.class);
        registry.registerPacket(0xFE, ServerListPingPacket.class);
        registry.registerPacket(0x6C, EnchantItemPacket.class);
    }
}
