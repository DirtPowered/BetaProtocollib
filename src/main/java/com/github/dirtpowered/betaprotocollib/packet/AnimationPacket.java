package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.AnimationPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class AnimationPacket extends AbstractPacket<AnimationPacketData> {

    public AnimationPacket() {
        super(0x12);
    }

    @Override
    public ByteBuf writePacketData(AnimationPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeByte(packet.getAnimate());
        return buffer;
    }

    @Override
    public AnimationPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int animate = buffer.readByte();
        return new AnimationPacketData(entityId, animate);
    }
}
