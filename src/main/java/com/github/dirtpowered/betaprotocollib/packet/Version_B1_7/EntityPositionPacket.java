package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityPositionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityPositionPacket extends AbstractPacket<V1_7_3EntityPositionPacketData> {

    public EntityPositionPacket() {
        super(0x1F);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityPositionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeByte(packet.getZ());
        return buffer;
    }

    @Override
    public V1_7_3EntityPositionPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int x = buffer.readByte();
        int y = buffer.readByte();
        int z = buffer.readByte();
        return new V1_7_3EntityPositionPacketData(entityId, x, y, z);
    }
}
