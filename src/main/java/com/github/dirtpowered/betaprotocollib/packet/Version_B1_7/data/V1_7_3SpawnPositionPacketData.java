package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SpawnPositionPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3SpawnPositionPacketData extends Packet<SpawnPositionPacket> {
    private int x;
    private int y;
    private int z;

    @Override
    public Class<SpawnPositionPacket> getPacketClass() {
        return SpawnPositionPacket.class;
    }
}
