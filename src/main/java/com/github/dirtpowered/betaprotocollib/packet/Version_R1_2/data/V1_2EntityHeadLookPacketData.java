package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.EntityHeadLookPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_2EntityHeadLookPacketData extends Packet<EntityHeadLookPacket> {
    private int entityId;
    private int headYaw;

    @Override
    public Class<EntityHeadLookPacket> getPacketClass() {
        return EntityHeadLookPacket.class;
    }
}
