package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3UseEntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UseEntityPacket extends AbstractPacket<V1_7_3UseEntityPacketData> {

    public UseEntityPacket() {
        super(0x07);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3UseEntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getTargetEntityId());
        buffer.writeBoolean(packet.isLeftClick());
        return buffer;
    }

    @Override
    public V1_7_3UseEntityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int targetEntityId = buffer.readInt();
        boolean isLeftClick = buffer.readBoolean();
        return new V1_7_3UseEntityPacketData(entityId, targetEntityId, isLeftClick);
    }
}
