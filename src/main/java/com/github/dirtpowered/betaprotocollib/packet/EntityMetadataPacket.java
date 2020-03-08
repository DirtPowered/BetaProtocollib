package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.data.DataWatcher;
import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.EntityMetadataPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.List;

public class EntityMetadataPacket extends AbstractPacket<EntityMetadataPacketData> {

    public EntityMetadataPacket() {
        super(0x28);
    }

    @Override
    public ByteBuf writePacketData(EntityMetadataPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        DataWatcher.writeMetadata(buffer, packet.getMetadata());
        return buffer;
    }

    @Override
    public EntityMetadataPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        List<WatchableObject> watchableObjects = DataWatcher.readMetadata(buffer);
        return new EntityMetadataPacketData(entityId, watchableObjects);
    }
}
