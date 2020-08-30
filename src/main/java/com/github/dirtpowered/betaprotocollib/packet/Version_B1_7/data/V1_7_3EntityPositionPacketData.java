package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityPositionPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityPositionPacketData extends Packet<EntityPositionPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;

    @Override
    public Class<EntityPositionPacket> getPacketClass() {
        return EntityPositionPacket.class;
    }
}
