package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.PlayerPositionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerPositionPacket extends AbstractPacket<PlayerPositionPacketData> {

    public PlayerPositionPacket() {
        super(0x0B);
    }

    @Override
    public ByteBuf writePacketData(PlayerPositionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeDouble(packet.getX());
        buffer.writeDouble(packet.getY());
        buffer.writeDouble(packet.getStance());
        buffer.writeDouble(packet.getZ());
        buffer.writeBoolean(packet.isOnGround());

        return buffer;
    }

    @Override
    public PlayerPositionPacketData readPacketData(ByteBuf buffer) {
        double x = buffer.readDouble();
        double y = buffer.readDouble();
        double stance = buffer.readDouble();
        double z = buffer.readDouble();
        boolean onGround = buffer.readBoolean();

        return new PlayerPositionPacketData(x, y, z, stance, onGround);
    }
}
