package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerPositionPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3PlayerPositionPacketData extends Packet<PlayerPositionPacket> {
    private double x;
    private double y;
    private double z;
    private double stance;
    private boolean onGround;

    @Override
    public Class<PlayerPositionPacket> getPacketClass() {
        return PlayerPositionPacket.class;
    }
}
