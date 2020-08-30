package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data.V1_4ClientSettingsPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ClientSettingsPacket extends AbstractPacket<V1_4ClientSettingsPacketData> {

    public ClientSettingsPacket() {
        super(0xCC);
    }

    @Override
    public ByteBuf writePacketData(V1_4ClientSettingsPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getLocale(), buffer);
        buffer.writeByte(packet.getViewDistance());
        buffer.writeByte(packet.getChatFlags() | (packet.isColorsEnabled() ? 1 : 0) << 3);
        buffer.writeByte(packet.getDifficulty());
        buffer.writeBoolean(packet.isShowCape());
        return buffer;
    }

    @Override
    public V1_4ClientSettingsPacketData readPacketData(ByteBuf buffer) {
        String locale = readString(buffer, 7);
        int viewDistance = buffer.readByte();
        byte mode = buffer.readByte();
        int chatFlags = mode & 7;
        boolean colors = (mode & 8) == 8;
        int difficulty = buffer.readByte();
        boolean showCape = buffer.readBoolean();
        return new V1_4ClientSettingsPacketData(locale, viewDistance, chatFlags, difficulty, colors, showCape);
    }
}
