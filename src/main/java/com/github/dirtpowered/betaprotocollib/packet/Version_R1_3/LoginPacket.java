package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3LoginPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class LoginPacket extends AbstractPacket<V1_3LoginPacketData> {

    public LoginPacket() {
        super(0x01);
    }

    @Override
    public ByteBuf writePacketData(V1_3LoginPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getWorldType().name(), buffer);

        int gamemode = packet.getGamemode();

        if (packet.isHardcore()) {
            gamemode |= 8;
        }

        buffer.writeByte(gamemode);

        buffer.writeByte(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getWorldHeight());
        buffer.writeByte(packet.getMaxPlayers());
        return buffer;
    }

    @Override
    public V1_3LoginPacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        WorldType worldType = WorldType.fromString(readString(buffer, 16));

        byte mode = buffer.readByte();
        boolean hardcore = (mode & 8) == 8;

        int gamemode = mode & -9;

        int dimension = buffer.readByte();
        int difficulty = buffer.readByte();
        int worldHeight = buffer.readUnsignedByte();
        int maxPlayers = buffer.readUnsignedByte();
        return new V1_3LoginPacketData(id, worldType, gamemode, dimension, difficulty, worldHeight, maxPlayers, hardcore);
    }
}
