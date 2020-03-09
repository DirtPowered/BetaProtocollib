package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.PickupSpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PickupSpawnPacket extends AbstractPacket<PickupSpawnPacketData> {

    public PickupSpawnPacket() {
        super(0x15);
    }

    @Override
    public ByteBuf writePacketData(PickupSpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        BetaItemStack itemStack = packet.getItemStack();

        buffer.writeInt(packet.getEntityId());
        buffer.writeShort(itemStack.getBlockId());
        buffer.writeByte(itemStack.getAmount());
        buffer.writeShort(itemStack.getData());

        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        buffer.writeByte(packet.getRoll());
        return buffer;
    }

    @Override
    public PickupSpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int itemId = buffer.readShort();
        int amount = buffer.readByte();
        int itemData = buffer.readShort();

        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        int roll = buffer.readByte();
        return new PickupSpawnPacketData(entityId, x, y, z, yaw, pitch, roll, new BetaItemStack(itemId, amount, itemData));
    }
}
