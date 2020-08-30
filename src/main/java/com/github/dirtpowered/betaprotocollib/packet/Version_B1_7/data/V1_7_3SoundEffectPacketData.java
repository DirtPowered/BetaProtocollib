package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SoundEffectPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3SoundEffectPacketData extends Packet<SoundEffectPacket> {
    private int soundType;
    private int x;
    private int y;
    private int z;
    private int data;

    @Override
    public Class<SoundEffectPacket> getPacketClass() {
        return SoundEffectPacket.class;
    }
}
