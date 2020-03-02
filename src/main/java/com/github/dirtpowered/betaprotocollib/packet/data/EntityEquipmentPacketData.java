package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.EntityEquipmentPacket;

public class EntityEquipmentPacketData extends Packet {

    private int entityId;
    private int slot;
    private int itemId;
    private int itemData;

    public EntityEquipmentPacketData(int entityId, int slot, int itemId, int itemData) {
        this.entityId = entityId;
        this.slot = slot;
        this.itemId = itemId;
        this.itemData = itemData;
    }

    public int getEntityId() {
        return entityId;
    }

    public int getSlot() {
        return slot;
    }

    public int getItemId() {
        return itemId;
    }

    public int getItemData() {
        return itemData;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) EntityEquipmentPacket.class;
    }
}
