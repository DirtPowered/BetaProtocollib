package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2EntityHeadLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityHeadLookPacket extends AbstractPacket<V1_2EntityHeadLookPacketData> {

    public EntityHeadLookPacket() {
        super(0x23);
    }

    @Override
    public ByteBuf writePacketData(V1_2EntityHeadLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getHeadYaw());
        return buffer;
    }

    @Override
    public V1_2EntityHeadLookPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int headYaw = buffer.readByte();
        return new V1_2EntityHeadLookPacketData(entityId, headYaw);
    }
}
