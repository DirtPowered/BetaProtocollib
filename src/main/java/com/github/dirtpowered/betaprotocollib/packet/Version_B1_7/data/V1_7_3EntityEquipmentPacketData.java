package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityEquipmentPacket;

public class V1_7_3EntityEquipmentPacketData extends Packet<EntityEquipmentPacket> {
    private int entityId;
    private int slot;
    private int itemId;
    private int itemData;

    public V1_7_3EntityEquipmentPacketData(int entityId, int slot, int itemId, int itemData) {
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
    public Class<EntityEquipmentPacket> getPacketClass() {
        return EntityEquipmentPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3EntityEquipmentPacketData{"
                + "entityId=" + entityId
                + ", slot=" + slot
                + ", itemId=" + itemId
                + ", itemData=" + itemData
                + '}';
    }
}
