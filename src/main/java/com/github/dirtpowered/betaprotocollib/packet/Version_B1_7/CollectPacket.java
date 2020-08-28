package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3CollectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class CollectPacket extends AbstractPacket<V1_7_3CollectPacketData> {

    public CollectPacket() {
        super(0x16);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3CollectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getTargetEntityId());
        return buffer;
    }

    @Override
    public V1_7_3CollectPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int targetEntityId = buffer.readInt();
        return new V1_7_3CollectPacketData(entityId, targetEntityId);
    }
}
