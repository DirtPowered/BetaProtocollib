package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3SleepPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class SleepPacket extends AbstractPacket<V1_7_3SleepPacketData> {

    public SleepPacket() {
        super(0x11);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3SleepPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeBoolean(packet.isWakeup());
        buffer.writeInt(packet.getX());
        buffer.writeByte(packet.getY());
        buffer.writeInt(packet.getZ());
        return buffer;
    }

    @Override
    public V1_7_3SleepPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        boolean wakeup = buffer.readBoolean();
        int x = buffer.readInt();
        int y = buffer.readByte();
        int z = buffer.readInt();
        return new V1_7_3SleepPacketData(entityId, wakeup, x, y, z);
    }
}
