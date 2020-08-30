package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1RespawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RespawnPacket extends AbstractPacket<V1_8_1RespawnPacketData> {

    public RespawnPacket() {
        super(0x09);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1RespawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getGameMode());
        buffer.writeShort(packet.getWorldHeight());
        buffer.writeLong(packet.getMapSeed());
        return buffer;
    }

    @Override
    public V1_8_1RespawnPacketData readPacketData(ByteBuf buffer) {
        int dimension = buffer.readByte();
        int difficulty = buffer.readByte();
        int gamemode = buffer.readByte();
        short worldHeight = buffer.readShort();
        long mapSeed = buffer.readLong();
        return new V1_8_1RespawnPacketData(dimension, difficulty, gamemode, worldHeight, mapSeed);
    }
}
