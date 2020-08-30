package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.LoginPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_2LoginPacketData extends Packet<LoginPacket> {
    private int entityId;
    private String playerName;
    private WorldType worldType;
    private int gameMode;
    private int dimension;
    private int difficulty;
    private int worldHeight;
    private int maxPlayers;

    @Override
    public Class<LoginPacket> getPacketClass() {
        return LoginPacket.class;
    }
}