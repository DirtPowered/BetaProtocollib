package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.FlyingPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3FlyingPacketData extends Packet<FlyingPacket> {
    private boolean onGround;

    @Override
    public Class<FlyingPacket> getPacketClass() {
        return FlyingPacket.class;
    }
}
