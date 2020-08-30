package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityStatusPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityStatusPacketData extends Packet<EntityStatusPacket> {
    private int entityId;
    private int status;

    @Override
    public Class<EntityStatusPacket> getPacketClass() {
        return EntityStatusPacket.class;
    }
}
