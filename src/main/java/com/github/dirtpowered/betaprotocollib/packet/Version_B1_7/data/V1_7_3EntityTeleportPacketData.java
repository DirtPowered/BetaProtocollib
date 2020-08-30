package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityTeleportPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityTeleportPacketData extends Packet<EntityTeleportPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private int yaw;
    private int pitch;

    @Override
    public Class<EntityTeleportPacket> getPacketClass() {
        return EntityTeleportPacket.class;
    }
}
