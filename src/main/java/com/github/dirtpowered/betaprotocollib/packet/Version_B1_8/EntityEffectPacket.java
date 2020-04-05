package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.EntityEffectPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityEffectPacket extends AbstractPacket<EntityEffectPacketData> {

    public EntityEffectPacket() {
        super(0x29);
    }

    @Override
    public ByteBuf writePacketData(EntityEffectPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getEffectId());
        buffer.writeByte(packet.getAmplifier());
        buffer.writeShort(packet.getDuration());
        return buffer;
    }

    @Override
    public EntityEffectPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int effectId = buffer.readByte();
        int amplifier = buffer.readByte();
        short duration = buffer.readShort();
        return new EntityEffectPacketData(entityId, effectId, amplifier, duration);
    }
}
