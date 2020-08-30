package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data.V1_4SoundEffectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SoundEffectPacket extends AbstractPacket<V1_4SoundEffectPacketData> {

    public SoundEffectPacket() {
        super(0x3D);
    }

    @Override
    public ByteBuf writePacketData(V1_4SoundEffectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getSoundType());
        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeInt(packet.getData());
        buffer.writeBoolean(packet.isDisableRelativeVolume());
        return buffer;
    }

    @Override
    public V1_4SoundEffectPacketData readPacketData(ByteBuf buffer) {
        int soundType = buffer.readInt();
        int x = buffer.readInt();
        int y = buffer.readUnsignedByte();
        int z = buffer.readInt();
        int data = buffer.readInt();
        boolean disableRelativeVolume = buffer.readBoolean();
        return new V1_4SoundEffectPacketData(soundType, x, y, z, data, disableRelativeVolume);
    }
}
