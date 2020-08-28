package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3PlayerPositionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerPositionPacket extends AbstractPacket<V1_7_3PlayerPositionPacketData> {

    public PlayerPositionPacket() {
        super(0x0B);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3PlayerPositionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeDouble(packet.getX());
        buffer.writeDouble(packet.getY());
        buffer.writeDouble(packet.getStance());
        buffer.writeDouble(packet.getZ());
        buffer.writeBoolean(packet.isOnGround());

        return buffer;
    }

    @Override
    public V1_7_3PlayerPositionPacketData readPacketData(ByteBuf buffer) {
        double x = buffer.readDouble();
        double y = buffer.readDouble();
        double stance = buffer.readDouble();
        double z = buffer.readDouble();
        boolean onGround = buffer.readBoolean();

        return new V1_7_3PlayerPositionPacketData(x, y, z, stance, onGround);
    }
}
