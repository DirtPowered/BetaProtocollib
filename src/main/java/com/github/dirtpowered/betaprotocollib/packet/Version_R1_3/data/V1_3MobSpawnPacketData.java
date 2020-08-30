package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.MobSpawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3MobSpawnPacketData extends Packet<MobSpawnPacket> {
    private int entityId;
    private byte type;
    private int x;
    private int y;
    private int z;
    private byte yaw;
    private byte pitch;
    private byte headYaw;
    private int velocityX;
    private int velocityY;
    private int velocityZ;
    private List<WatchableObject> metadata;

    @Override
    public Class<MobSpawnPacket> getPacketClass() {
        return MobSpawnPacket.class;
    }
}
