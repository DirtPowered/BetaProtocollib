package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.ServerListPingPacket;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class V1_4ServerListPingPacketData extends Packet<ServerListPingPacket> {

    @Override
    public Class<ServerListPingPacket> getPacketClass() {
        return ServerListPingPacket.class;
    }
}
