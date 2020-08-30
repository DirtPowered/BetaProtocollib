package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.PlayerAbilitiesPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3PlayerAbilitiesPacketData extends Packet<PlayerAbilitiesPacket> {
    private boolean damageDisabled;
    private boolean flying;
    private boolean flyingAllowed;
    private boolean creativeMode;
    private float flyingSpeed;
    private float walkingSpeed;

    @Override
    public Class<PlayerAbilitiesPacket> getPacketClass() {
        return PlayerAbilitiesPacket.class;
    }
}
