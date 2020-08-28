package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3AnimationPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class AnimationPacket extends AbstractPacket<V1_7_3AnimationPacketData> {

    public AnimationPacket() {
        super(0x12);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3AnimationPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getAnimate());
        return buffer;
    }

    @Override
    public V1_7_3AnimationPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int animate = buffer.readByte();
        return new V1_7_3AnimationPacketData(entityId, animate);
    }
}
