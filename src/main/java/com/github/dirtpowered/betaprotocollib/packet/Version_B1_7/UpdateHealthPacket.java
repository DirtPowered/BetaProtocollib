package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3UpdateHealthPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateHealthPacket extends AbstractPacket<V1_7_3UpdateHealthPacketData> {

    public UpdateHealthPacket() {
        super(0x08);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3UpdateHealthPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getHealth());
        return buffer;
    }

    @Override
    public V1_7_3UpdateHealthPacketData readPacketData(ByteBuf buffer) {
        int health = buffer.readShort();
        return new V1_7_3UpdateHealthPacketData(health);
    }
}
