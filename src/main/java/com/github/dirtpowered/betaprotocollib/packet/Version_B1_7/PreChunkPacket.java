package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.PreChunkPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PreChunkPacket extends AbstractPacket<PreChunkPacketData> {

    public PreChunkPacket() {
        super(0x32);
    }

    @Override
    public ByteBuf writePacketData(PreChunkPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getZ());
        buffer.writeBoolean(packet.isFull());
        return buffer;
    }

    @Override
    public PreChunkPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int z = buffer.readInt();
        boolean full = buffer.readBoolean();
        return new PreChunkPacketData(x, z, full);
    }
}
