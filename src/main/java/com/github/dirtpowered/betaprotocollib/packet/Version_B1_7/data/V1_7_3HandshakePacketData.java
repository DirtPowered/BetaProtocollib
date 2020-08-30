package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.HandshakePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3HandshakePacketData extends Packet<HandshakePacket> {
    private String playerName;

    @Override
    public Class<HandshakePacket> getPacketClass() {
        return HandshakePacket.class;
    }
}
