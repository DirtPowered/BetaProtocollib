package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.RespawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_2RespawnPacketData extends Packet<RespawnPacket> {
    private int dimension;
    private int difficulty;
    private int gameMode;
    private int worldHeight;
    private WorldType worldType;

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }
}
