package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data.V1_4PickupSpawnPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PickupSpawnPacket extends AbstractPacket<V1_4PickupSpawnPacketData> {

    public PickupSpawnPacket() {
        super(0x15);
    }

    @Override
    public ByteBuf writePacketData(V1_4PickupSpawnPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());

        writeItemStack(buffer, packet.getItemStack(), ItemStackType.ITEM_R1_3);

        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());

        buffer.writeByte(packet.getYaw());
        buffer.writeByte(packet.getPitch());
        buffer.writeByte(packet.getRoll());
        return buffer;
    }

    @Override
    public V1_4PickupSpawnPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();

        int itemId = buffer.readShort();
        BetaItemStack itemStack = readItemStack(buffer, itemId, ItemStackType.ITEM_R1_3);

        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();

        int yaw = buffer.readByte();
        int pitch = buffer.readByte();
        int roll = buffer.readByte();
        return new V1_4PickupSpawnPacketData(entityId, x, y, z, yaw, pitch, roll, itemStack);
    }
}
