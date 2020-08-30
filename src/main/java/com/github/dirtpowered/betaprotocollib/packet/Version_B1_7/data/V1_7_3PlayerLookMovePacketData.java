package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerLookMovePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3PlayerLookMovePacketData extends Packet<PlayerLookMovePacket> {
    private double x;
    private double y;
    private double stance;
    private double z;
    private float yaw;
    private float pitch;
    private boolean onGround;

    @Override
    public Class<PlayerLookMovePacket> getPacketClass() {
        return PlayerLookMovePacket.class;
    }
}
