package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EntityEquipmentPacket;

public class V1_3EntityEquipmentPacketData extends Packet<EntityEquipmentPacket> {
    private int entityId;
    private int slot;
    private BetaItemStack itemStack;

    public V1_3EntityEquipmentPacketData(int entityId, int slot, BetaItemStack itemStack) {
        this.entityId = entityId;
        this.slot = slot;
        this.itemStack = itemStack;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    public int getSlot() {
        return slot;
    }

    public int getEntityId() {
        return entityId;
    }

    @Override
    public Class<EntityEquipmentPacket> getPacketClass() {
        return EntityEquipmentPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3EntityEquipmentPacketData{"
                + "entityId=" + entityId
                + ", slot=" + slot
                + ", itemStack=" + itemStack
                + '}';
    }
}
