package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityStatusPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityStatusPacket extends AbstractPacket<EntityStatusPacketData> {

    public EntityStatusPacket() {
        super(0x26);
    }

    @Override
    public ByteBuf writePacketData(EntityStatusPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getStatus());
        return buffer;
    }

    @Override
    public EntityStatusPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int status = buffer.readByte();
        return new EntityStatusPacketData(entityId, status);
    }
}
