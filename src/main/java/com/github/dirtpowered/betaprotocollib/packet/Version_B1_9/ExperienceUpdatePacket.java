package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data.V1_9ExperienceUpdatePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ExperienceUpdatePacket extends AbstractPacket<V1_9ExperienceUpdatePacketData> {

    public ExperienceUpdatePacket() {
        super(0x2B);
    }

    @Override
    public ByteBuf writePacketData(V1_9ExperienceUpdatePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeFloat(packet.getProgress());
        buffer.writeShort(packet.getLevel());
        buffer.writeShort(packet.getTotalExperience());
        return buffer;
    }

    @Override
    public V1_9ExperienceUpdatePacketData readPacketData(ByteBuf buffer) {
        float progress = buffer.readFloat();
        short level = buffer.readShort();
        short totalExperience = buffer.readShort();
        return new V1_9ExperienceUpdatePacketData(progress, level, totalExperience);
    }
}
