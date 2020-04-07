package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.AttachEntityPacket;

public class AttachEntityPacketData extends Packet<AttachEntityPacket> {
    private int entityId;
    private int vehicleEntityId;

    public AttachEntityPacketData(int entityId, int vehicleEntityId) {
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
        return "AttachEntityPacketData{"
                + "entityId=" + entityId
                + ", vehicleEntityId=" + vehicleEntityId
                + '}';
    }
}
