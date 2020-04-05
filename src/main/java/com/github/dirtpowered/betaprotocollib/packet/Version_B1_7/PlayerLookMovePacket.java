package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.PlayerLookMovePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerLookMovePacket extends AbstractPacket<PlayerLookMovePacketData> {

    public PlayerLookMovePacket() {
        super(0x0D);
    }

    @Override
    public ByteBuf writePacketData(PlayerLookMovePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeDouble(packet.getX());
        buffer.writeDouble(packet.getStance());
        buffer.writeDouble(packet.getY());
        buffer.writeDouble(packet.getZ());
        buffer.writeFloat(packet.getYaw());
        buffer.writeFloat(packet.getPitch());
        buffer.writeBoolean(packet.isOnGround());
        return buffer;
    }

    @Override
    public PlayerLookMovePacketData readPacketData(ByteBuf buffer) {
        double x = buffer.readDouble();
        double y = buffer.readDouble();
        double stance = buffer.readDouble();
        double z = buffer.readDouble();
        float yaw = buffer.readFloat();
        float pitch = buffer.readFloat();
        boolean onGround = buffer.readBoolean();
        return new PlayerLookMovePacketData(x, y, stance, z, yaw, pitch, onGround);
    }
}
