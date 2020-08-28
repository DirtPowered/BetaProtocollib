package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3NamedEntitySpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class NamedEntitySpawnPacket extends AbstractPacket<V1_7_3NamedEntitySpawnPacketData> {

    public NamedEntitySpawnPacket() {
        super(0x14);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3NamedEntitySpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getName(), buffer);
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getRotation());
        buffer.writeByte(packet.getPitch());
        buffer.writeShort(packet.getCurrentItem());
        return buffer;
    }

    @Override
    public V1_7_3NamedEntitySpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        String name = readString(buffer, 16);
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        byte rotation = buffer.readByte();
        byte pitch = buffer.readByte();
        int currentItem = buffer.readShort();

        return new V1_7_3NamedEntitySpawnPacketData(entityId, name, x, y, z, rotation, pitch, currentItem);
    }
}
