package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3ClientSettingsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ClientSettingsPacket extends AbstractPacket<V1_3ClientSettingsPacketData> {

    public ClientSettingsPacket() {
        super(0xCC);
    }

    @Override
    public ByteBuf writePacketData(V1_3ClientSettingsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getLocale(), buffer);
        buffer.writeByte(packet.getViewDistance());
        buffer.writeByte(packet.getChatFlags() | (packet.areColorsEnabled() ? 1 : 0) << 3);
        buffer.writeByte(packet.getDifficulty());
        return buffer;
    }

    @Override
    public V1_3ClientSettingsPacketData readPacketData(ByteBuf buffer) {
        String locale = readString(buffer, 7);
        int viewDistance = buffer.readByte();
        byte mode = buffer.readByte();
        int chatFlags = mode & 7;
        boolean colors = (mode & 8) == 8;
        int difficulty = buffer.readByte();
        return new V1_3ClientSettingsPacketData(locale, viewDistance, chatFlags, difficulty, colors);
    }
}
