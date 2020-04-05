package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.CollectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CollectPacket extends AbstractPacket<CollectPacketData> {

    public CollectPacket() {
        super(0x16);
    }

    @Override
    public ByteBuf writePacketData(CollectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getTargetEntityId());
        return buffer;
    }

    @Override
    public CollectPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int targetEntityId = buffer.readInt();
        return new CollectPacketData(entityId, targetEntityId);
    }
}
