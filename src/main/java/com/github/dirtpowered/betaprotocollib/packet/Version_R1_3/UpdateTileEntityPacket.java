package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3UpdateTileEntityPacketData;
import com.mojang.nbt.CompoundTag;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateTileEntityPacket extends AbstractPacket<V1_3UpdateTileEntityPacketData> {

    public UpdateTileEntityPacket() {
        super(0x84);
    }

    @Override
    public ByteBuf writePacketData(V1_3UpdateTileEntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getAction());
        writeNBT(packet.getNbtData(), buffer);
        return buffer;
    }

    @Override
    public V1_3UpdateTileEntityPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readShort();
        int z = buffer.readInt();
        int action = buffer.readByte();
        CompoundTag tag = readNBT(buffer);
        return new V1_3UpdateTileEntityPacketData(x, y, z, action, tag);
    }
}
