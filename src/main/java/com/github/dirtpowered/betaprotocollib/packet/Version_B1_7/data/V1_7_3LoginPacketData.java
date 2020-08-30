package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.LoginPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3LoginPacketData extends Packet<LoginPacket> {
    private int entityId;
    private String playerName;
    private long seed;
    private int dimension;

    @Override
    public Class<LoginPacket> getPacketClass() {
        return LoginPacket.class;
    }
}