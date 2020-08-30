package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UseEntityPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3UseEntityPacketData extends Packet<UseEntityPacket> {
    private int entityId;
    private int targetEntityId;
    private boolean isLeftClick;

    @Override
    public Class<UseEntityPacket> getPacketClass() {
        return UseEntityPacket.class;
    }
}
