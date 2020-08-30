package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.UpdateHealthPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1UpdateHealthPacketData extends Packet<UpdateHealthPacket> {
    private int health;
    private int food;
    private float saturation;

    @Override
    public Class<UpdateHealthPacket> getPacketClass() {
        return UpdateHealthPacket.class;
    }
}
