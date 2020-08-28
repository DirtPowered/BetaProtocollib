package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3PreChunkPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PreChunkPacket extends AbstractPacket<V1_7_3PreChunkPacketData> {

    public PreChunkPacket() {
        super(0x32);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3PreChunkPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getZ());
        buffer.writeBoolean(packet.isFull());
        return buffer;
    }

    @Override
    public V1_7_3PreChunkPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int z = buffer.readInt();
        boolean full = buffer.readBoolean();
        return new V1_7_3PreChunkPacketData(x, z, full);
    }
}
