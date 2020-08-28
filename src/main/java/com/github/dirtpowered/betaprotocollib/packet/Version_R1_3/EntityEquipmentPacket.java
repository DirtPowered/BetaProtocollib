package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3EntityEquipmentPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityEquipmentPacket extends AbstractPacket<V1_3EntityEquipmentPacketData> {

    public EntityEquipmentPacket() {
        super(0x05);
    }

    @Override
    public ByteBuf writePacketData(V1_3EntityEquipmentPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeShort(packet.getSlot());

        writeItemStack(buffer, packet.getItemStack(), ItemStackType.ITEM_R1_3);
        return buffer;
    }

    @Override
    public V1_3EntityEquipmentPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int slot = buffer.readShort();
        short itemId = buffer.readShort();

        BetaItemStack itemStack = readItemStack(buffer, itemId, ItemStackType.ITEM_R1_3);
        return new V1_3EntityEquipmentPacketData(entityId, slot, itemStack);
    }
}
