package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.PlayerAbilitiesPacket;

public class V1_3PlayerAbilitiesPacketData extends Packet<PlayerAbilitiesPacket> {

    @Override
    public Class<PlayerAbilitiesPacket> getPacketClass() {
        return PlayerAbilitiesPacket.class;
    }
}
