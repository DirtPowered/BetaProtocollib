package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3PlayerAbilitiesPacketData;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

public class PlayerAbilitiesPacket extends AbstractPacket<V1_3PlayerAbilitiesPacketData> {

    public PlayerAbilitiesPacket() {
        super(0XCA);
    }

    @Override
    public ByteBuf writePacketData(V1_3PlayerAbilitiesPacketData packet) throws IOException {
        return null;
    }

    @Override
    public V1_3PlayerAbilitiesPacketData readPacketData(ByteBuf buffer) throws IOException {
        return null;
    }
}
