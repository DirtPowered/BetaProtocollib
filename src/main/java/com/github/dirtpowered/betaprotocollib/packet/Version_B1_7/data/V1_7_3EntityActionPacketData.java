package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityActionPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityActionPacketData extends Packet<EntityActionPacket> {
    private int entityId;
    private int state;

    @Override
    public Class<EntityActionPacket> getPacketClass() {
        return EntityActionPacket.class;
    }
}
