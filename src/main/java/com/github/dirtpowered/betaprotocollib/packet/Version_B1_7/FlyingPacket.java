package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3FlyingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class FlyingPacket extends AbstractPacket<V1_7_3FlyingPacketData> {

    public FlyingPacket() {
        super(0x0A);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3FlyingPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeBoolean(packet.isOnGround());
        return buffer;
    }

    @Override
    public V1_7_3FlyingPacketData readPacketData(ByteBuf buffer) {
        boolean onGround = buffer.readBoolean();
        return new V1_7_3FlyingPacketData(onGround);
    }
}
