package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3PlayerLookPacketData extends Packet<PlayerLookPacket> {
    private float yaw;
    private float pitch;
    private boolean onGround;

    @Override
    public Class<PlayerLookPacket> getPacketClass() {
        return PlayerLookPacket.class;
    }
}
