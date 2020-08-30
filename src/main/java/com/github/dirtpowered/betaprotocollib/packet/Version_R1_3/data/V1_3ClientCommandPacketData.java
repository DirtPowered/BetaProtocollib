package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.ClientCommandPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3ClientCommandPacketData extends Packet<ClientCommandPacket> {
    private int commandId;

    @Override
    public Class<ClientCommandPacket> getPacketClass() {
        return ClientCommandPacket.class;
    }
}
