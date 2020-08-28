package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data.V1_1LoginPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class LoginPacket extends AbstractPacket<V1_1LoginPacketData> {

    public LoginPacket() {
        super(0x01);
    }

    @Override
    public ByteBuf writePacketData(V1_1LoginPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getPlayerName(), buffer);
        buffer.writeLong(packet.getSeed());
        writeString(packet.getWorldType().name(), buffer);
        buffer.writeInt(packet.getGamemode());
        buffer.writeByte(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getWorldHeight());
        buffer.writeByte(packet.getMaxPlayers());
        return buffer;
    }

    @Override
    public V1_1LoginPacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        String playername = readString(buffer, 16);
        long seed = buffer.readLong();
        WorldType worldType = WorldType.fromString(readString(buffer, 16));
        int gamemode = buffer.readInt();
        int dimension = buffer.readByte();
        int difficulty = buffer.readByte();
        int worldHeight = buffer.readUnsignedByte();
        int maxPlayers = buffer.readUnsignedByte();

        return new V1_1LoginPacketData(id, playername, seed, worldType, gamemode, dimension, difficulty, worldHeight, maxPlayers);
    }
}
