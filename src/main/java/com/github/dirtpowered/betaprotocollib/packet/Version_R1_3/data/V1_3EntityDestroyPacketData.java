package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EntityDestroyPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3EntityDestroyPacketData extends Packet<EntityDestroyPacket> {
    private int[] entityIds;

    @Override
    public Class<EntityDestroyPacket> getPacketClass() {
        return EntityDestroyPacket.class;
    }
}
