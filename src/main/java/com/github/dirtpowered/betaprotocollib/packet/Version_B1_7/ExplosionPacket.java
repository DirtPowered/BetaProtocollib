package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3ExplosionPacketData;
import com.github.dirtpowered.betaprotocollib.utils.BlockLocation;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.ArrayList;
import java.util.List;

public class ExplosionPacket extends AbstractPacket<V1_7_3ExplosionPacketData> {

    public ExplosionPacket() {
        super(0x3C);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3ExplosionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeDouble(packet.getX());
        buffer.writeDouble(packet.getY());
        buffer.writeDouble(packet.getZ());
        buffer.writeFloat(packet.getExplosionSize());
        buffer.writeInt(packet.getDestroyedBlockPositions().size());

        for (BlockLocation record : packet.getDestroyedBlockPositions()) {
            buffer.writeByte(record.getX());
            buffer.writeByte(record.getY());
            buffer.writeByte(record.getZ());
        }

        return buffer;
    }

    @Override
    public V1_7_3ExplosionPacketData readPacketData(ByteBuf buffer) {
        double x = buffer.readDouble();
        double y = buffer.readDouble();
        double z = buffer.readDouble();
        float explosionSize = buffer.readFloat();
        int destroyedBlockSize = buffer.readInt();

        List<BlockLocation> records = new ArrayList<>();
        for (int i = 0; i < destroyedBlockSize; i++) {
            int locX = buffer.readByte();
            int locY = buffer.readByte();
            int locZ = buffer.readByte();

            records.add(new BlockLocation(locX, locY, locZ));
        }

        return new V1_7_3ExplosionPacketData(x, y, z, explosionSize, records);
    }
}
