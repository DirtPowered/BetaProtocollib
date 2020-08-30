package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data.V1_1RespawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RespawnPacket extends AbstractPacket<V1_1RespawnPacketData> {

    public RespawnPacket() {
        super(0x09);
    }

    @Override
    public ByteBuf writePacketData(V1_1RespawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getGameMode());
        buffer.writeShort(packet.getWorldHeight());
        buffer.writeLong(packet.getMapSeed());
        writeString(packet.getWorldType().name(), buffer);
        return buffer;
    }

    @Override
    public V1_1RespawnPacketData readPacketData(ByteBuf buffer) {
        int dimension = buffer.readByte();
        int difficulty = buffer.readByte();
        int gamemode = buffer.readByte();
        short worldHeight = buffer.readShort();
        long mapSeed = buffer.readLong();
        WorldType worldType = WorldType.fromString(readString(buffer, 16));
        return new V1_1RespawnPacketData(dimension, difficulty, gamemode, worldHeight, mapSeed, worldType);
    }
}
