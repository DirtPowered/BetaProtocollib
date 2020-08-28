package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2PlayerAbilitiesPacketData;
import io.netty.buffer.ByteBuf;

public class PlayerAbilitiesPacket extends AbstractPacket<V1_2PlayerAbilitiesPacketData> {

    public PlayerAbilitiesPacket() {
        super(0xCA);
    }

    @Override
    public ByteBuf writePacketData(V1_2PlayerAbilitiesPacketData packet) {
        return null;
    }

    @Override
    public V1_2PlayerAbilitiesPacketData readPacketData(ByteBuf buffer) {
        return null;
    }
}
