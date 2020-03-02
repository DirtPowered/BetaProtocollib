package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.RespawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RespawnPacket extends AbstractPacket<RespawnPacketData> {

    public RespawnPacket() {
        super(0x09);
    }

    @Override
    public ByteBuf writePacketData(RespawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getDimension());
        return buffer;
    }

    @Override
    public RespawnPacketData readPacketData(ByteBuf buffer) {
        byte state = buffer.readByte();
        return new RespawnPacketData(state);
    }
}
