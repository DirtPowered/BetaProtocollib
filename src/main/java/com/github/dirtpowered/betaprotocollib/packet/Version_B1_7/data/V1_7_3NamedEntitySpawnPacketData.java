package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.NamedEntitySpawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3NamedEntitySpawnPacketData extends Packet<NamedEntitySpawnPacket> {
    private int entityId;
    private String name;
    private int x;
    private int y;
    private int z;
    private byte rotation;
    private byte pitch;
    private int currentItem;

    @Override
    public Class<NamedEntitySpawnPacket> getPacketClass() {
        return NamedEntitySpawnPacket.class;
    }
}
