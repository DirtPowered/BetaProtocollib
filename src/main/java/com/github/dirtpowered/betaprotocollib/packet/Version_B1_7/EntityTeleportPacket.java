package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.EntityTeleportPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityTeleportPacket extends AbstractPacket<EntityTeleportPacketData> {

    public EntityTeleportPacket() {
        super(0x22);
    }

    @Override
    public ByteBuf writePacketData(EntityTeleportPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public EntityTeleportPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        return new EntityTeleportPacketData(entityId, x, y, z, yaw, pitch);
    }
}
