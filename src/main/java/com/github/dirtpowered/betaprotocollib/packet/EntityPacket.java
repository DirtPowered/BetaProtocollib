package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityPacket extends AbstractPacket<EntityPacketData> {

    public EntityPacket() {
        super(0x1E);
    }

    @Override
    public ByteBuf writePacketData(EntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        return buffer;
    }

    @Override
    public EntityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        return new EntityPacketData(entityId);
    }

}
