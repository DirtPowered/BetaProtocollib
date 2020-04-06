package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.RespawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RespawnPacket extends AbstractPacket<RespawnPacketData> {

    public RespawnPacket() {
        super(0x09);
    }

    @Override
    public ByteBuf writePacketData(RespawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getGamemode());
        buffer.writeShort(packet.getWorldHeight());
        buffer.writeLong(packet.getMapSeed());
        return buffer;
    }

    @Override
    public RespawnPacketData readPacketData(ByteBuf buffer) {
        int dimension = buffer.readByte();
        int difficulty = buffer.readByte();
        int gamemode = buffer.readByte();
        short worldHeight = buffer.readShort();
        long mapSeed = buffer.readLong();
        return new RespawnPacketData(dimension, difficulty, gamemode, worldHeight, mapSeed);
    }
}
