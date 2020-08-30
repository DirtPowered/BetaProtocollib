package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.KeepAlivePacket;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class V1_7_3KeepAlivePacketData extends Packet<KeepAlivePacket> {

    @Override
    public Class<KeepAlivePacket> getPacketClass() {
        return KeepAlivePacket.class;
    }
}
