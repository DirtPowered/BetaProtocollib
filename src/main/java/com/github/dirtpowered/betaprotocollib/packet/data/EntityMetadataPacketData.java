package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityMetadataPacket;

import java.util.List;

public class EntityMetadataPacketData extends Packet {

    /*
     * https://wiki.vg/Entity_metadata#Entity_Metadata_Format
     */

    private int entityId;
    private List<WatchableObject> metadata;

    public EntityMetadataPacketData(int entityId, List<WatchableObject> metadata) {
        this.entityId = entityId;
        this.metadata = metadata;
    }

    public int getEntityId() {
        return entityId;
    }

    public List<WatchableObject> getMetadata() {
        return metadata;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityMetadataPacket.class;
    }
}
