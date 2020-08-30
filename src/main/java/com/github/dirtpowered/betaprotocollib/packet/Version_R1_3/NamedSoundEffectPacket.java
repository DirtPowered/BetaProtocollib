package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3NamedSoundEffectPacket;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class NamedSoundEffectPacket extends AbstractPacket<V1_3NamedSoundEffectPacket> {

    public NamedSoundEffectPacket() {
        super(0x3E);
    }

    @Override
    public ByteBuf writePacketData(V1_3NamedSoundEffectPacket packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getSoundName(), buffer);
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeFloat(packet.getVolume());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public V1_3NamedSoundEffectPacket readPacketData(ByteBuf buffer) {
        String soundName = readString(buffer, 32);
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        float volume = buffer.readFloat();
        int pitch = buffer.readUnsignedByte();
        return new V1_3NamedSoundEffectPacket(soundName, x, y, z, volume, pitch);
    }
}
