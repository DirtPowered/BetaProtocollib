package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.ExperienceUpdatePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ExperienceUpdatePacket extends AbstractPacket<ExperienceUpdatePacketData> {

    public ExperienceUpdatePacket() {
        super(0x2B);
    }

    @Override
    public ByteBuf writePacketData(ExperienceUpdatePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getProgress());
        buffer.writeByte(packet.getLevel());
        buffer.writeShort(packet.getTotalExperience());
        return buffer;
    }

    @Override
    public ExperienceUpdatePacketData readPacketData(ByteBuf buffer) {
        int progress = buffer.readByte();
        int level = buffer.readByte();
        short totalExperience = buffer.readShort();
        return new ExperienceUpdatePacketData(progress, level, totalExperience);
    }
}
