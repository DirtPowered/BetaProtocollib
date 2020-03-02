package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityMoveLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityMoveLookPacket extends AbstractPacket<EntityMoveLookPacketData> {

    public EntityMoveLookPacket() {
        super(0x21);
    }

    @Override
    public ByteBuf writePacketData(EntityMoveLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeByte(packet.getZ());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public EntityMoveLookPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int x = buffer.readByte();
        int y = buffer.readByte();
        int z = buffer.readByte();
        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        return new EntityMoveLookPacketData(entityId, x, y, z, yaw, pitch);
    }
}
