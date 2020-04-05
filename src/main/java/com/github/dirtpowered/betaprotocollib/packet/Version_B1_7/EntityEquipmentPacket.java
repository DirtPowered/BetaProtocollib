package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.EntityEquipmentPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityEquipmentPacket extends AbstractPacket<EntityEquipmentPacketData> {

    public EntityEquipmentPacket() {
        super(0x05);
    }

    @Override
    public ByteBuf writePacketData(EntityEquipmentPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeShort(packet.getSlot());
        buffer.writeShort(packet.getItemId());
        buffer.writeShort(packet.getItemData());
        return buffer;
    }

    @Override
    public EntityEquipmentPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int slot = buffer.readShort();
        int itemId = buffer.readShort();
        int itemData = buffer.readShort();
        return new EntityEquipmentPacketData(entityId, slot, itemId, itemData);
    }
}
