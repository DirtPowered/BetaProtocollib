package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UseEntityPacket;

public class UseEntityPacketData extends Packet {

    private int entityId;
    private int targetEntityId;
    private boolean isLeftClick;

    public UseEntityPacketData(int entityId, int targetEntityId, boolean isLeftClick) {
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
    public <T> Class<T> getPacketClass() {
        return (Class<T>) UseEntityPacket.class;
    }
}
