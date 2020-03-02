package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityActionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityActionPacket extends AbstractPacket<EntityActionPacketData> {

    public EntityActionPacket() {
        super(0x13);
    }

    @Override
    public ByteBuf writePacketData(EntityActionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getState());
        return buffer;
    }

    @Override
    public EntityActionPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int state = buffer.readByte();
        return new EntityActionPacketData(entityId, state);
    }
}
