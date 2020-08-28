package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityLookPacket extends AbstractPacket<V1_7_3EntityLookPacketData> {

    public EntityLookPacket() {
        super(0x20);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public V1_7_3EntityLookPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        return new V1_7_3EntityLookPacketData(entityId, yaw, pitch);
    }
}
