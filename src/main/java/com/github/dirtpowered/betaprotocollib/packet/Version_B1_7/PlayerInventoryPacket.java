package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.PlayerInventoryPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerInventoryPacket extends AbstractPacket<PlayerInventoryPacketData> {

    public PlayerInventoryPacket() {
        super(0x05);
    }

    @Override
    public ByteBuf writePacketData(PlayerInventoryPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeShort(packet.getSlot());
        buffer.writeShort(packet.getItemId());
        buffer.writeShort(packet.getItemDamage());
        return buffer;
    }

    @Override
    public PlayerInventoryPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int slot = buffer.readShort();
        int itemId = buffer.readShort();
        int itemDamage = buffer.readShort();

        return new PlayerInventoryPacketData(entityId, slot, itemId, itemDamage);
    }
}
