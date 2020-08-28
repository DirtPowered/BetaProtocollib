package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.data.WorldType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3RespawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RespawnPacket extends AbstractPacket<V1_3RespawnPacketData> {

    public RespawnPacket() {
        super(0x09);
    }

    @Override
    public ByteBuf writePacketData(V1_3RespawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getDimension());
        buffer.writeByte(packet.getDifficulty());
        buffer.writeByte(packet.getGamemode());
        buffer.writeShort(packet.getWorldHeight());
        writeString(packet.getWorldType().name(), buffer);
        return buffer;
    }

    @Override
    public V1_3RespawnPacketData readPacketData(ByteBuf buffer) {
        int dimension = buffer.readInt();
        int difficulty = buffer.readByte();
        int gamemode = buffer.readByte();
        short worldHeight = buffer.readShort();
        WorldType worldType = WorldType.fromString(readString(buffer, 16));
        return new V1_3RespawnPacketData(dimension, difficulty, gamemode, worldHeight, worldType);
    }
}
