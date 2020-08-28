package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.PlayerAbilitiesPacket;

public class V1_2PlayerAbilitiesPacketData extends Packet<PlayerAbilitiesPacket> {

    public V1_2PlayerAbilitiesPacketData() {

    }

    @Override
    public Class<PlayerAbilitiesPacket> getPacketClass() {
        return PlayerAbilitiesPacket.class;
    }
}
