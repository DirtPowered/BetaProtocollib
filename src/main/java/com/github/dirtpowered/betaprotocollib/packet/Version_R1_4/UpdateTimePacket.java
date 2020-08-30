package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data.V1_4UpdateTimePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateTimePacket extends AbstractPacket<V1_4UpdateTimePacketData> {

    public UpdateTimePacket() {
        super(0x04);
    }

    @Override
    public ByteBuf writePacketData(V1_4UpdateTimePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeLong(packet.getAge());
        buffer.writeLong(packet.getTime());
        return buffer;
    }

    @Override
    public V1_4UpdateTimePacketData readPacketData(ByteBuf buffer) {
        long age = buffer.readLong();
        long time = buffer.readLong();
        return new V1_4UpdateTimePacketData(age, time);
    }
}
