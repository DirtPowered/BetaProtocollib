package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1BedAndWeatherPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BedAndWeatherPacket extends AbstractPacket<V1_8_1BedAndWeatherPacketData> {

    public BedAndWeatherPacket() {
        super(0x46);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1BedAndWeatherPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getReason());
        buffer.writeByte(packet.getGameMode());
        return buffer;
    }

    @Override
    public V1_8_1BedAndWeatherPacketData readPacketData(ByteBuf buffer) {
        int reason = buffer.readByte();
        int gamemode = buffer.readByte();
        return new V1_8_1BedAndWeatherPacketData(reason, gamemode);
    }
}
