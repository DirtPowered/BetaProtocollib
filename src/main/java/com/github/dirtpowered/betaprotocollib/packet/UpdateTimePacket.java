package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.UpdateTimePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateTimePacket extends AbstractPacket<UpdateTimePacketData> {

    public UpdateTimePacket() {
        super(0x04);
    }

    @Override
    public ByteBuf writePacketData(UpdateTimePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeLong(packet.getTime());
        return buffer;
    }

    @Override
    public UpdateTimePacketData readPacketData(ByteBuf buffer) {
        long time = buffer.readLong();
        return new UpdateTimePacketData(time);
    }
}
