package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2MultiBlockChangePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MultiBlockChangePacket extends AbstractPacket<V1_2MultiBlockChangePacketData> {

    public MultiBlockChangePacket() {
        super(0x34);
    }

    @Override
    public ByteBuf writePacketData(V1_2MultiBlockChangePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getChunkX());
        buffer.writeInt(packet.getChunkZ());
        buffer.writeShort(packet.getRecordCount());
        buffer.writeInt(packet.getDataSize());
        buffer.writeBytes(packet.getData());
        return buffer;
    }

    @Override
    public V1_2MultiBlockChangePacketData readPacketData(ByteBuf buffer) {
        int chunkX = buffer.readInt();
        int chunkZ = buffer.readInt();
        int recordCount = buffer.readShort() & 0xffff;

        int dataSize = buffer.readInt();
        byte[] data = new byte[dataSize];

        buffer.readBytes(data);
        return new V1_2MultiBlockChangePacketData(chunkX, chunkZ, recordCount, dataSize, data);
    }
}
