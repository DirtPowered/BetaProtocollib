package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.ExplosionPacketData;
import com.github.dirtpowered.betaprotocollib.utils.BlockLocation;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.ArrayList;
import java.util.List;

public class ExplosionPacket extends AbstractPacket<ExplosionPacketData> {

    public ExplosionPacket() {
        super(0x3C);
    }

    @Override
    public ByteBuf writePacketData(ExplosionPacketData packet) {
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
    public ExplosionPacketData readPacketData(ByteBuf buffer) {
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

        return new ExplosionPacketData(x, y, z, explosionSize, records);
    }
}
