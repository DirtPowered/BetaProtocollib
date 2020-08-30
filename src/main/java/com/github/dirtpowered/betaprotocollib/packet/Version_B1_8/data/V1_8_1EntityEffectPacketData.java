package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.EntityEffectPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1EntityEffectPacketData extends Packet<EntityEffectPacket> {
    private int entityId;
    private int effectId;
    private int amplifier;
    private short duration;

    @Override
    public Class<EntityEffectPacket> getPacketClass() {
        return EntityEffectPacket.class;
    }
}
