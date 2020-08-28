package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityActionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityActionPacket extends AbstractPacket<V1_7_3EntityActionPacketData> {

    public EntityActionPacket() {
        super(0x13);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityActionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getState());
        return buffer;
    }

    @Override
    public V1_7_3EntityActionPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int state = buffer.readByte();

        return new V1_7_3EntityActionPacketData(entityId, state);
    }
}
