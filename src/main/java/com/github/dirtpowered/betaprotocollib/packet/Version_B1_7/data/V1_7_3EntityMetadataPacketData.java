package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.WatchableObject;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityMetadataPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityMetadataPacketData extends Packet<EntityMetadataPacket> {
    private int entityId;
    private List<WatchableObject> metadata;

    @Override
    public Class<EntityMetadataPacket> getPacketClass() {
        return EntityMetadataPacket.class;
    }
}
