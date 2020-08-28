package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EntityDestroyPacket;

import java.util.Arrays;

public class V1_3EntityDestroyPacketData extends Packet<EntityDestroyPacket> {

    private int[] entityIds;

    public V1_3EntityDestroyPacketData(int[] entityIds) {
        this.entityIds = entityIds;
    }

    public int[] getEntityIds() {
        return entityIds;
    }

    @Override
    public Class<EntityDestroyPacket> getPacketClass() {
        return EntityDestroyPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3EntityDestroyPacketData{"
                + "entityIds=" + Arrays.toString(entityIds)
                + '}';
    }
}
