package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.data.DataWatcher;
import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2MobSpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.List;

public class MobSpawnPacket extends AbstractPacket<V1_2MobSpawnPacketData> {

    public MobSpawnPacket() {
        super(0x18);
    }

    @Override
    public ByteBuf writePacketData(V1_2MobSpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();

        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getType());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        buffer.writeByte(packet.getHeadYaw());

        if (packet.getMetadata() == null || packet.getMetadata().isEmpty()) {
            buffer.writeByte(127);
        } else {
            DataWatcher.writeMetadata(buffer, packet.getMetadata());
        }
        return buffer;
    }

    @Override
    public V1_2MobSpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        byte type = buffer.readByte();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        byte yaw = buffer.readByte();
        byte pitch = buffer.readByte();
        byte headYaw = buffer.readByte();
        List<WatchableObject> watchableObjects = DataWatcher.readMetadata(buffer);

        return new V1_2MobSpawnPacketData(entityId, type, x, y, z, yaw, pitch, headYaw, watchableObjects);
    }
}
