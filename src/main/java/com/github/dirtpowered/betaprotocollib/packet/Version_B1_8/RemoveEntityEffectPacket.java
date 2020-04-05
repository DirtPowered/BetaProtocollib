package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.RemoveEntityEffectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RemoveEntityEffectPacket extends AbstractPacket<RemoveEntityEffectPacketData> {

    public RemoveEntityEffectPacket() {
        super(0x2A);
    }

    @Override
    public ByteBuf writePacketData(RemoveEntityEffectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getEffectId());
        return buffer;
    }

    @Override
    public RemoveEntityEffectPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int effectId = buffer.readByte();
        return new RemoveEntityEffectPacketData(entityId, effectId);
    }
}
