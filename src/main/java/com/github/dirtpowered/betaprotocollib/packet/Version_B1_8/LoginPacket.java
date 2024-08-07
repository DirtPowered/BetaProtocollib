package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1LoginPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class LoginPacket extends AbstractPacket<V1_8_1LoginPacketData> {

    public LoginPacket() {
        super(0x01);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1LoginPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getPlayerName(), buffer);
        buffer.writeLong(packet.getSeed());
        buffer.writeInt(packet.getGameMode());
        buffer.writeByte(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getWorldHeight());
        buffer.writeByte(packet.getMaxPlayers());
        return buffer;
    }

    @Override
    public V1_8_1LoginPacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        String playername = readString(buffer, 16);
        long seed = buffer.readLong();
        int gamemode = buffer.readInt();
        int dimension = buffer.readByte();
        int difficulty = buffer.readByte();
        int worldHeight = buffer.readUnsignedByte();
        int maxPlayers = buffer.readUnsignedByte();

        return new V1_8_1LoginPacketData(id, playername, seed, gamemode, dimension, difficulty, worldHeight, maxPlayers);
    }
}
