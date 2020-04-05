package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.SpawnPositionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SpawnPositionPacket extends AbstractPacket<SpawnPositionPacketData> {

    public SpawnPositionPacket() {
        super(0x06);
    }

    @Override
    public ByteBuf writePacketData(SpawnPositionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        return buffer;
    }

    @Override
    public SpawnPositionPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        return new SpawnPositionPacketData(x, y, z);
    }
}
