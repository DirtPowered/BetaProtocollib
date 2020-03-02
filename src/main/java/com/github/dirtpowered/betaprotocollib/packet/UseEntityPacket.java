package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.UseEntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UseEntityPacket extends AbstractPacket<UseEntityPacketData> {

    public UseEntityPacket() {
        super(0x07);
    }

    @Override
    public ByteBuf writePacketData(UseEntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getTargetEntityId());
        buffer.writeBoolean(packet.isLeftClick());
        return buffer;
    }

    @Override
    public UseEntityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int targetEntityId = buffer.readInt();
        boolean isLeftClick = buffer.readBoolean();
        return new UseEntityPacketData(entityId, targetEntityId, isLeftClick);
    }
}
