package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.PlayerLookPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerLookPacket extends AbstractPacket<PlayerLookPacketData> {

    public PlayerLookPacket() {
        super(0x0C);
    }

    @Override
    public ByteBuf writePacketData(PlayerLookPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeFloat(packet.getYaw());
        buffer.writeFloat(packet.getPitch());
        buffer.writeBoolean(packet.isOnGround());
        return buffer;
    }

    @Override
    public PlayerLookPacketData readPacketData(ByteBuf buffer) {
        float yaw = buffer.readFloat();
        float pitch = buffer.readFloat();
        boolean onGround = buffer.readBoolean();
        return new PlayerLookPacketData(yaw, pitch, onGround);
    }
}
