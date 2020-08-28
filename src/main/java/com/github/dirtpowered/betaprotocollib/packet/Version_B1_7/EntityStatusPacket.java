package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3EntityStatusPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class EntityStatusPacket extends AbstractPacket<V1_7_3EntityStatusPacketData> {

    public EntityStatusPacket() {
        super(0x26);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3EntityStatusPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getStatus());
        return buffer;
    }

    @Override
    public V1_7_3EntityStatusPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int status = buffer.readByte();
        return new V1_7_3EntityStatusPacketData(entityId, status);
    }
}
