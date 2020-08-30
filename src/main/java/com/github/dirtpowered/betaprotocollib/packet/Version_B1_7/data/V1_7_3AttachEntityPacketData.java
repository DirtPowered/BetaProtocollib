package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AttachEntityPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3AttachEntityPacketData extends Packet<AttachEntityPacket> {
    private int entityId;
    private int vehicleEntityId;

    @Override
    public Class<AttachEntityPacket> getPacketClass() {
        return AttachEntityPacket.class;
    }
}
