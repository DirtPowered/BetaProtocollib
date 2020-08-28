package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1PlayerListItemPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerListItemPacket extends AbstractPacket<V1_8_1PlayerListItemPacketData> {

    public PlayerListItemPacket() {
        super(0xC9);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1PlayerListItemPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getUsername(), buffer);
        buffer.writeBoolean(packet.isOnline());
        buffer.writeShort(packet.getPing());
        return buffer;
    }

    @Override
    public V1_8_1PlayerListItemPacketData readPacketData(ByteBuf buffer) {
        String username = readString(buffer, 16);
        boolean online = buffer.readBoolean();
        short ping = buffer.readShort();

        return new V1_8_1PlayerListItemPacketData(username, online, ping);
    }
}
