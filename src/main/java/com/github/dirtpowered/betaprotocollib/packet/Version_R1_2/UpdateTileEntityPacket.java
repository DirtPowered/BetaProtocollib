package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data.V1_2UpdateTileEntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateTileEntityPacket extends AbstractPacket<V1_2UpdateTileEntityPacketData> {

    public UpdateTileEntityPacket() {
        super(0x84);
    }

    @Override
    public ByteBuf writePacketData(V1_2UpdateTileEntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getAction());
        buffer.writeInt(packet.getMobType());
        buffer.writeInt(packet.getCustomData());
        buffer.writeInt(packet.getCustomData2());
        return buffer;
    }

    @Override
    public V1_2UpdateTileEntityPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readShort();
        int z = buffer.readInt();
        int action = buffer.readByte();
        int mobType = buffer.readInt();
        int customData = buffer.readInt();
        int customData2 = buffer.readInt();
        return new V1_2UpdateTileEntityPacketData(x, y, z, action, mobType, customData, customData2);
    }
}
