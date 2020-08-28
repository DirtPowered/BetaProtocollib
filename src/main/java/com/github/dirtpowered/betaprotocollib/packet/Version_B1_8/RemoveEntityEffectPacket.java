package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.V1_8_1RemoveEntityEffectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class RemoveEntityEffectPacket extends AbstractPacket<V1_8_1RemoveEntityEffectPacketData> {

    public RemoveEntityEffectPacket() {
        super(0x2A);
    }

    @Override
    public ByteBuf writePacketData(V1_8_1RemoveEntityEffectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getEffectId());
        return buffer;
    }

    @Override
    public V1_8_1RemoveEntityEffectPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int effectId = buffer.readByte();
        return new V1_8_1RemoveEntityEffectPacketData(entityId, effectId);
    }
}
