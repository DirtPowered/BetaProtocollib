package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RespawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1RespawnPacketData extends Packet<RespawnPacket> {
    private int dimension;
    private int difficulty;
    private int gameMode;
    private int worldHeight;
    private long mapSeed;

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }
}
