package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityDestroyPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityDestroyPacket extends AbstractPacket<EntityDestroyPacketData> {

    public EntityDestroyPacket() {
        super(0x1D);
    }

    @Override
    public ByteBuf writePacketData(EntityDestroyPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        return buffer;
    }

    @Override
    public EntityDestroyPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        return new EntityDestroyPacketData(entityId);
    }
}
