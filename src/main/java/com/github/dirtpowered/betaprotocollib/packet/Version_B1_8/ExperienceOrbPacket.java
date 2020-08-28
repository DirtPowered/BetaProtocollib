package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1ExperienceOrbPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ExperienceOrbPacket extends AbstractPacket<V1_8_1ExperienceOrbPacketData> {

    public ExperienceOrbPacket() {
        super(0x1A);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1ExperienceOrbPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeShort(packet.getCount());
        return buffer;
    }

    @Override
    public V1_8_1ExperienceOrbPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        short count = buffer.readShort();
        return new V1_8_1ExperienceOrbPacketData(entityId, x, y, z, count);
    }
}
