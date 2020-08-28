package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityPacket extends AbstractPacket<V1_7_3EntityPacketData> {

    public EntityPacket() {
        super(0x1E);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        return buffer;
    }

    @Override
    public V1_7_3EntityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        return new V1_7_3EntityPacketData(entityId);
    }

}
