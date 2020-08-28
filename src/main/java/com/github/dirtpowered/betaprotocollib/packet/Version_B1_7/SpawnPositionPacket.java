package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3SpawnPositionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SpawnPositionPacket extends AbstractPacket<V1_7_3SpawnPositionPacketData> {

    public SpawnPositionPacket() {
        super(0x06);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3SpawnPositionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        return buffer;
    }

    @Override
    public V1_7_3SpawnPositionPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        return new V1_7_3SpawnPositionPacketData(x, y, z);
    }
}
