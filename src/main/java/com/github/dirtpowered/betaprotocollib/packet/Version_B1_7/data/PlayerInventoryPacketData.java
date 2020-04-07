package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayerInventoryPacket;

public class PlayerInventoryPacketData extends Packet<PlayerInventoryPacket> {

    private int entityId;
    private int slot;
    private int itemId;
    private int itemDamage;

    public PlayerInventoryPacketData(int entityId, int slot, int itemId, int itemDamage) {
        this.entityId = entityId;
        this.slot = slot;
        this.itemId = itemId;
        this.itemDamage = itemDamage;
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

    public int getItemDamage() {
        return itemDamage;
    }

    @Override
    public Class<PlayerInventoryPacket> getPacketClass() {
        return PlayerInventoryPacket.class;
    }

    @Override
    public String toString() {
        return "PlayerInventoryPacketData{"
                + "entityId=" + entityId
                + ", slot=" + slot
                + ", itemId=" + itemId
                + ", itemDamage=" + itemDamage
                + '}';
    }
}
