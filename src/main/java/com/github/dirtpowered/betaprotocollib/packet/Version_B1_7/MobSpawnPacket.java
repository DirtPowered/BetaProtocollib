package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.DataWatcher;
import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.MobSpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.List;

public class MobSpawnPacket extends AbstractPacket<MobSpawnPacketData> {

    public MobSpawnPacket() {
        super(0x18);
    }

    @Override
    public ByteBuf writePacketData(MobSpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();

        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getType());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        DataWatcher.writeMetadata(buffer, packet.getMetadata());

        return buffer;
    }

    @Override
    public MobSpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        byte type = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        byte yaw = buffer.readByte();
        byte pitch = buffer.readByte();
        List<WatchableObject> watchableObjects = DataWatcher.readMetadata(buffer);

        return new MobSpawnPacketData(entityId, type, x, y, z, yaw, pitch, watchableObjects);
    }
}
