package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.RespawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3RespawnPacketData extends Packet<RespawnPacket> {
    private int dimension;
    private int difficulty;
    private int gamemode;
    private int worldHeight;
    private WorldType worldType;

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }
}
