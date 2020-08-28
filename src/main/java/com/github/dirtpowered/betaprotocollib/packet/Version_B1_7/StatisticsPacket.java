package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3StatisticsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class StatisticsPacket extends AbstractPacket<V1_7_3StatisticsPacketData> {

    public StatisticsPacket() {
        super(0xC8);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3StatisticsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getStatId());
        buffer.writeByte(packet.getData());
        return buffer;
    }

    @Override
    public V1_7_3StatisticsPacketData readPacketData(ByteBuf buffer) {
        int statId = buffer.readInt();
        int data = buffer.readByte();
        return new V1_7_3StatisticsPacketData(statId, data);
    }
}
