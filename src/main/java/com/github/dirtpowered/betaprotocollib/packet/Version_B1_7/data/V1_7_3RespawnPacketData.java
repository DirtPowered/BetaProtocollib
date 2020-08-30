package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.RespawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3RespawnPacketData extends Packet<RespawnPacket> {
    private byte dimension;

    @Override
    public Class<RespawnPacket> getPacketClass() {
        return RespawnPacket.class;
    }
}
