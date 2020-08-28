package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1ExperienceUpdatePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ExperienceUpdatePacket extends AbstractPacket<V1_8_1ExperienceUpdatePacketData> {

    public ExperienceUpdatePacket() {
        super(0x2B);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1ExperienceUpdatePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getProgress());
        buffer.writeByte(packet.getLevel());
        buffer.writeShort(packet.getTotalExperience());
        return buffer;
    }

    @Override
    public V1_8_1ExperienceUpdatePacketData readPacketData(ByteBuf buffer) {
        int progress = buffer.readByte();
        int level = buffer.readByte();
        short totalExperience = buffer.readShort();
        return new V1_8_1ExperienceUpdatePacketData(progress, level, totalExperience);
    }
}
