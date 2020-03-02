package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityLookPacket extends AbstractPacket<EntityLookPacketData> {

    public EntityLookPacket() {
        super(0x20);
    }

    @Override
    public ByteBuf writePacketData(EntityLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public EntityLookPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        return new EntityLookPacketData(entityId, yaw, pitch);
    }
}
