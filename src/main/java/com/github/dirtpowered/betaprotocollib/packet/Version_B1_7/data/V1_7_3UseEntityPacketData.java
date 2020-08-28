package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UseEntityPacket;

public class V1_7_3UseEntityPacketData extends Packet<UseEntityPacket> {

    private int entityId;
    private int targetEntityId;
    private boolean isLeftClick;

    public V1_7_3UseEntityPacketData(int entityId, int targetEntityId, boolean isLeftClick) {
        this.entityId = entityId;
        this.targetEntityId = targetEntityId;
        this.isLeftClick = isLeftClick;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getTargetEntityId() {
        return targetEntityId;
    }

    public boolean isLeftClick() {
        return isLeftClick;
    }

    @Override
    public Class<UseEntityPacket> getPacketClass() {
        return UseEntityPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3UseEntityPacketData{"
                + "entityId=" + entityId
                + ", targetEntityId=" + targetEntityId
                + ", isLeftClick=" + isLeftClick
                + '}';
    }
}
