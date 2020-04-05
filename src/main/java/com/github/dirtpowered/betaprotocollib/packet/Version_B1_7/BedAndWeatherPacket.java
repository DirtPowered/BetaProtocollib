package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.BedAndWeatherPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BedAndWeatherPacket extends AbstractPacket<BedAndWeatherPacketData> {

    public BedAndWeatherPacket() {
        super(0x46);
    }

    @Override
    public ByteBuf writePacketData(BedAndWeatherPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWeatherState());
        return buffer;
    }

    @Override
    public BedAndWeatherPacketData readPacketData(ByteBuf buffer) {
        int weatherState = buffer.readByte();
        return new BedAndWeatherPacketData(weatherState);
    }
}
