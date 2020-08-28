package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.data.DataWatcher;
import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityMetadataPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.List;

public class EntityMetadataPacket extends AbstractPacket<V1_7_3EntityMetadataPacketData> {

    public EntityMetadataPacket() {
        super(0x28);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityMetadataPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        DataWatcher.writeMetadata(buffer, packet.getMetadata());
        return buffer;
    }

    @Override
    public V1_7_3EntityMetadataPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        List<WatchableObject> watchableObjects = DataWatcher.readMetadata(buffer);
        return new V1_7_3EntityMetadataPacketData(entityId, watchableObjects);
    }
}
