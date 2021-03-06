package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityVelocityPacket;

public class EntityVelocityPacketData extends Packet<EntityVelocityPacket> {
    private int entityId;
    private int motionX;
    private int motionY;
    private int motionZ;

    public EntityVelocityPacketData(int entityId, int motionX, int motionY, int motionZ) {
        this.entityId = entityId;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getMotionX() {
        return motionX;
    }

    public int getMotionY() {
        return motionY;
    }

    public int getMotionZ() {
        return motionZ;
    }

    @Override
    public Class<EntityVelocityPacket> getPacketClass() {
        return EntityVelocityPacket.class;
    }

    @Override
    public String toString() {
        return "EntityVelocityPacketData{"
                + "entityId=" + entityId
                + ", motionX=" + motionX
                + ", motionY=" + motionY
                + ", motionZ=" + motionZ
                + '}';
    }
}
