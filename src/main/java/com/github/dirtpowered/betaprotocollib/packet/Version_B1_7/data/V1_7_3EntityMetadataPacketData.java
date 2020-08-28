package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityMetadataPacket;

import java.util.List;

public class V1_7_3EntityMetadataPacketData extends Packet<EntityMetadataPacket> {

    /*
     * https://wiki.vg/Entity_metadata#Entity_Metadata_Format
     */

    private int entityId;
    private List<WatchableObject> metadata;

    public V1_7_3EntityMetadataPacketData(int entityId, List<WatchableObject> metadata) {
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
    public Class<EntityMetadataPacket> getPacketClass() {
        return EntityMetadataPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3EntityMetadataPacketData{"
                + "entityId=" + entityId
                + ", metadata=" + metadata
                + '}';
    }
}
