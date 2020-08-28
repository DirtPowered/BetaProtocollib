package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3BlockActionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockActionPacket extends AbstractPacket<V1_3BlockActionPacketData> {

    public BlockActionPacket() {
        super(0x36);
    }

    @Override
    public ByteBuf writePacketData(V1_3BlockActionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getActionType());
        buffer.writeByte(packet.getPitch());
        buffer.writeShort(packet.getBlockId());
        return buffer;
    }

    @Override
    public V1_3BlockActionPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readShort();
        int z = buffer.readInt();
        int actionType = buffer.readByte();
        int pitch = buffer.readByte();
        int blockId = buffer.readShort();

        return new V1_3BlockActionPacketData(x, y, z, actionType, pitch, blockId);
    }
}
