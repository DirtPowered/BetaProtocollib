package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3UpdateTimePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateTimePacket extends AbstractPacket<V1_7_3UpdateTimePacketData> {

    public UpdateTimePacket() {
        super(0x04);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3UpdateTimePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeLong(packet.getTime());
        return buffer;
    }

    @Override
    public V1_7_3UpdateTimePacketData readPacketData(ByteBuf buffer) {
        long time = buffer.readLong();
        return new V1_7_3UpdateTimePacketData(time);
    }
}
