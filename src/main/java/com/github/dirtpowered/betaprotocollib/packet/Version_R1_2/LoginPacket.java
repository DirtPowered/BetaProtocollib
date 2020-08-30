package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2LoginPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class LoginPacket extends AbstractPacket<V1_2LoginPacketData> {

    public LoginPacket() {
        super(0x01);
    }

    @Override
    public ByteBuf writePacketData(V1_2LoginPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getPlayerName(), buffer);
        writeString(packet.getWorldType().name(), buffer);
        buffer.writeInt(packet.getGameMode());
        buffer.writeInt(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getWorldHeight());
        buffer.writeByte(packet.getMaxPlayers());
        return buffer;
    }

    @Override
    public V1_2LoginPacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        String playername = readString(buffer, 16);
        WorldType worldType = WorldType.fromString(readString(buffer, 16));
        int gamemode = buffer.readInt();
        int dimension = buffer.readInt();
        int difficulty = buffer.readByte();
        int worldHeight = buffer.readUnsignedByte();
        int maxPlayers = buffer.readUnsignedByte();

        return new V1_2LoginPacketData(id, playername, worldType, gamemode, dimension, difficulty, worldHeight, maxPlayers);
    }
}
