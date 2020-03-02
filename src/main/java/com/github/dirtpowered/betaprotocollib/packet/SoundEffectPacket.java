package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.SoundEffectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SoundEffectPacket extends AbstractPacket<SoundEffectPacketData> {

    public SoundEffectPacket() {
        super(0x3D);
    }

    @Override
    public ByteBuf writePacketData(SoundEffectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getSoundType());
        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeInt(packet.getData());
        return buffer;
    }

    @Override
    public SoundEffectPacketData readPacketData(ByteBuf buffer) {
        int soundType = buffer.readInt();
        int x = buffer.readInt();
        int y = buffer.readUnsignedByte();
        int z = buffer.readInt();
        int data = buffer.readInt();
        return new SoundEffectPacketData(soundType, x, y, z, data);
    }
}
