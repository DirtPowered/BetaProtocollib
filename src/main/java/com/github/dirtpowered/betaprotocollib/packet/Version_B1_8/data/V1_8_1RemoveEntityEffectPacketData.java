package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.RemoveEntityEffectPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1RemoveEntityEffectPacketData extends Packet<RemoveEntityEffectPacket> {
    private int entityId;
    private int effectId;

    @Override
    public Class<RemoveEntityEffectPacket> getPacketClass() {
        return RemoveEntityEffectPacket.class;
    }
}
