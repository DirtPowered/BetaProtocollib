package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AttachEntityPacket;

public class V1_7_3AttachEntityPacketData extends Packet<AttachEntityPacket> {
    private int entityId;
    private int vehicleEntityId;

    public V1_7_3AttachEntityPacketData(int entityId, int vehicleEntityId) {
        this.entityId = entityId;
        this.vehicleEntityId = vehicleEntityId;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getVehicleEntityId() {
        return vehicleEntityId;
    }

    @Override
    public Class<AttachEntityPacket> getPacketClass() {
        return AttachEntityPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3AttachEntityPacketData{"
                + "entityId=" + entityId
                + ", vehicleEntityId=" + vehicleEntityId
                + '}';
    }
}
