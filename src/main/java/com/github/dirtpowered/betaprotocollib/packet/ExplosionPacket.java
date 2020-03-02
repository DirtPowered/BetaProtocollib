package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.ExplosionPacketData;
import com.github.dirtpowered.betaprotocollib.utils.Location;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.ArrayList;

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

        for (Location record : packet.getDestroyedBlockPositions()) {
            buffer.writeByte((int) record.getX());
            buffer.writeByte((int) record.getY());
            buffer.writeByte((int) record.getZ());
        }

        return buffer;
    }

    @Override
    public ExplosionPacketData readPacketData(ByteBuf buffer) {
        int x = (int) buffer.readDouble();
        int y = (int) buffer.readDouble();
        int z = (int) buffer.readDouble();
        float explosionSize = buffer.readFloat();
        return new ExplosionPacketData(x, y, z, explosionSize, new ArrayList());
    }
}
