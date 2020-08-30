package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.KickDisconnectPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3KickDisconnectPacketData extends Packet<KickDisconnectPacket> {
    private String disconnectReason;

    @Override
    public Class<KickDisconnectPacket> getPacketClass() {
        return KickDisconnectPacket.class;
    }
}
