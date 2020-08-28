package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityMoveLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityMoveLookPacket extends AbstractPacket<V1_7_3EntityMoveLookPacketData> {

    public EntityMoveLookPacket() {
        super(0x21);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityMoveLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeByte(packet.getZ());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public V1_7_3EntityMoveLookPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int x = buffer.readByte();
        int y = buffer.readByte();
        int z = buffer.readByte();
        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        return new V1_7_3EntityMoveLookPacketData(entityId, x, y, z, yaw, pitch);
    }
}
