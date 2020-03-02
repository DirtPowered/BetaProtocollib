package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.FlyingPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class FlyingPacket extends AbstractPacket<FlyingPacketData> {

    public FlyingPacket() {
        super(0x0A);
    }

    @Override
    public ByteBuf writePacketData(FlyingPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeBoolean(packet.isOnGround());
        return buffer;
    }

    @Override
    public FlyingPacketData readPacketData(ByteBuf buffer) {
        boolean onGround = buffer.readBoolean();
        return new FlyingPacketData(onGround);
    }
}
