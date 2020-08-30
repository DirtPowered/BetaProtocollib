package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityDestroyPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityDestroyPacketData extends Packet<EntityDestroyPacket> {
    private int entityId;

    @Override
    public Class<EntityDestroyPacket> getPacketClass() {
        return EntityDestroyPacket.class;
    }
}
