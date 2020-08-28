package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3PlayerLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerLookPacket extends AbstractPacket<V1_7_3PlayerLookPacketData> {

    public PlayerLookPacket() {
        super(0x0C);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3PlayerLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeFloat(packet.getYaw());
        buffer.writeFloat(packet.getPitch());
        buffer.writeBoolean(packet.isOnGround());
        return buffer;
    }

    @Override
    public V1_7_3PlayerLookPacketData readPacketData(ByteBuf buffer) {
        float yaw = buffer.readFloat();
        float pitch = buffer.readFloat();
        boolean onGround = buffer.readBoolean();
        return new V1_7_3PlayerLookPacketData(yaw, pitch, onGround);
    }
}
