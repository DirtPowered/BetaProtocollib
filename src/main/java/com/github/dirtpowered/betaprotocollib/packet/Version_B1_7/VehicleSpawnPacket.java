package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3VehicleSpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class VehicleSpawnPacket extends AbstractPacket<V1_7_3VehicleSpawnPacketData> {

    public VehicleSpawnPacket() {
        super(0x17);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3VehicleSpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getType());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeInt(packet.getThrowerEntityId());

        if (packet.getThrowerEntityId() > 0) {
            buffer.writeShort(packet.getVelocityX());
            buffer.writeShort(packet.getVelocityY());
            buffer.writeShort(packet.getVelocityZ());
        }
        return buffer;
    }

    @Override
    public V1_7_3VehicleSpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int type = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        int throwerEntityId = buffer.readInt();
        int velocityX = 0;
        int velocityY = 0;
        int velocityZ = 0;

        if (throwerEntityId > 0) {
            velocityX = buffer.readShort();
            velocityY = buffer.readShort();
            velocityZ = buffer.readShort();
        }
        return new V1_7_3VehicleSpawnPacketData(entityId, type, x, y, z, throwerEntityId, velocityX, velocityY, velocityZ);
    }
}
