package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityLookPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityLookPacketData extends Packet<EntityLookPacket> {
    private int entityId;
    private int yaw;
    private int pitch;

    @Override
    public Class<EntityLookPacket> getPacketClass() {
        return EntityLookPacket.class;
    }
}
