package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.UpdateHealthPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateHealthPacket extends AbstractPacket<UpdateHealthPacketData> {

    public UpdateHealthPacket() {
        super(0x08);
    }

    @Override
    public ByteBuf writePacketData(UpdateHealthPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getHealth());
        return buffer;
    }

    @Override
    public UpdateHealthPacketData readPacketData(ByteBuf buffer) {
        int health = buffer.readShort();
        return new UpdateHealthPacketData(health);
    }
}
