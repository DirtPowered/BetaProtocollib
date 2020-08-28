package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3EntityDestroyPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityDestroyPacket extends AbstractPacket<V1_3EntityDestroyPacketData> {

    public EntityDestroyPacket() {
        super(0x1D);
    }

    @Override
    public ByteBuf writePacketData(V1_3EntityDestroyPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        int length = packet.getEntityIds().length;

        buffer.writeByte(length);

        for (int i = 0; i < length; ++i) {
            buffer.writeInt(packet.getEntityIds()[i]);
        }

        return buffer;
    }

    @Override
    public V1_3EntityDestroyPacketData readPacketData(ByteBuf buffer) {
        int length = buffer.readByte();
        int[] entities = new int[length];

        for (int i = 0; i < length; ++i) {
            entities[i] = buffer.readInt();
        }

        return new V1_3EntityDestroyPacketData(entities);
    }
}
