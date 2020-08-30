package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.LoginPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1LoginPacketData extends Packet<LoginPacket> {
    private int entityId;
    private String playerName;
    private long seed;
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