package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityVelocityPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityVelocityPacketData extends Packet<EntityVelocityPacket> {
    private int entityId;
    private int motionX;
    private int motionY;
    private int motionZ;

    @Override
    public Class<EntityVelocityPacket> getPacketClass() {
        return EntityVelocityPacket.class;
    }
}
