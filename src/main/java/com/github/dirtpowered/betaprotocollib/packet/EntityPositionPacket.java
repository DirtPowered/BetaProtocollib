package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityPositionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityPositionPacket extends AbstractPacket<EntityPositionPacketData> {

    public EntityPositionPacket() {
        super(0x1F);
    }

    @Override
    public ByteBuf writePacketData(EntityPositionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeByte(packet.getZ());
        return buffer;
    }

    @Override
    public EntityPositionPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int x = buffer.readByte();
        int y = buffer.readByte();
        int z = buffer.readByte();
        return new EntityPositionPacketData(entityId, x, y, z);
    }
}
