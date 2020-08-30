package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AnimationPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3AnimationPacketData extends Packet<AnimationPacket> {
    private int entityId;
    private int animate;

    @Override
    public Class<AnimationPacket> getPacketClass() {
        return AnimationPacket.class;
    }
}
