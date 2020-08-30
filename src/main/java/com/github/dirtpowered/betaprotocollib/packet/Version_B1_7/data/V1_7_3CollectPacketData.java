package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CollectPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3CollectPacketData extends Packet<CollectPacket> {
    private int entityId;
    private int targetEntityId;

    @Override
    public Class<CollectPacket> getPacketClass() {
        return CollectPacket.class;
    }
}
