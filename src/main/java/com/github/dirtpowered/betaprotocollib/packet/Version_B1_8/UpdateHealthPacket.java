package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.UpdateHealthPacketData;
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
        buffer.writeShort(packet.getFood());
        buffer.writeFloat(packet.getSaturation());
        return buffer;
    }

    @Override
    public UpdateHealthPacketData readPacketData(ByteBuf buffer) {
        int health = buffer.readShort();
        int food = buffer.readShort();
        float saturation = buffer.readFloat();
        return new UpdateHealthPacketData(health, food, saturation);
    }
}
