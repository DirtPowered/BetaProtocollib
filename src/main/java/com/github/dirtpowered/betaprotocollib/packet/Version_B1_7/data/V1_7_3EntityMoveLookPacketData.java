package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityMoveLookPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityMoveLookPacketData extends Packet<EntityMoveLookPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private int yaw;
    private int pitch;

    @Override
    public Class<EntityMoveLookPacket> getPacketClass() {
        return EntityMoveLookPacket.class;
    }
}
