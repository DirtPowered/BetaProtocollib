package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.NamedSoundEffectPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3NamedSoundEffectPacket extends Packet<NamedSoundEffectPacket> {
    private String soundName;
    private int x;
    private int y;
    private int z;
    private float volume;
    private int pitch;

    @Override
    public Class<NamedSoundEffectPacket> getPacketClass() {
        return NamedSoundEffectPacket.class;
    }
}
