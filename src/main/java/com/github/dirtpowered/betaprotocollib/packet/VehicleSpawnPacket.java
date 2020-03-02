package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.VehicleSpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class VehicleSpawnPacket extends AbstractPacket<VehicleSpawnPacketData> {

    public VehicleSpawnPacket() {
        super(0x17);
    }

    @Override
    public ByteBuf writePacketData(VehicleSpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getType());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeInt(1); //has velocity?
        buffer.writeShort(packet.getVelocityX());
        buffer.writeShort(packet.getVelocityY());
        buffer.writeShort(packet.getVelocityZ());
        return buffer;
    }

    @Override
    public VehicleSpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int type = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        //int hasVelocity = buffer.readInt(); //has velocity?
        int velocityX = buffer.readShort();
        int velocityY = buffer.readShort();
        int velocityZ = buffer.readShort();
        return new VehicleSpawnPacketData(entityId, type, x, y, z, velocityX, velocityY, velocityZ);
    }
}
