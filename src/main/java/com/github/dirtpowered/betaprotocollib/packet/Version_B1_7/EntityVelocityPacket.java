package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.EntityVelocityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityVelocityPacket extends AbstractPacket<EntityVelocityPacketData> {

    public EntityVelocityPacket() {
        super(0x1C);
    }

    @Override
    public ByteBuf writePacketData(EntityVelocityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeShort(packet.getMotionX());
        buffer.writeShort(packet.getMotionY());
        buffer.writeShort(packet.getMotionZ());
        return buffer;
    }

    @Override
    public EntityVelocityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int motionX = buffer.readShort();
        int motionY = buffer.readShort();
        int motionZ = buffer.readShort();
        return new EntityVelocityPacketData(entityId, motionX, motionY, motionZ);
    }
}
