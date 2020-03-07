package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.StatisticsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class StatisticsPacket extends AbstractPacket<StatisticsPacketData> {

    public StatisticsPacket() {
        super(0xC8);
    }

    @Override
    public ByteBuf writePacketData(StatisticsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getStatId());
        buffer.writeByte(packet.getData());
        return buffer;
    }

    @Override
    public StatisticsPacketData readPacketData(ByteBuf buffer) {
        int statId = buffer.readInt();
        int data = buffer.readByte();
        return new StatisticsPacketData(statId, data);
    }
}
