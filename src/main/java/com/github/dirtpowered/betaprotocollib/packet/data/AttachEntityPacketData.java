package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.AttachEntityPacket;

public class AttachEntityPacketData extends Packet {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) AttachEntityPacket.class;
    }
}
