package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.HandshakePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3HandshakePacketData extends Packet<HandshakePacket> {
    private int protocolVersion;
    private String playerName;
    private String host;
    private int port;

    @Override
    public Class<HandshakePacket> getPacketClass() {
        return HandshakePacket.class;
    }
}
