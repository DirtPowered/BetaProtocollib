package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3BlockBreakAnimationPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockBreakAnimationPacket extends AbstractPacket<V1_3BlockBreakAnimationPacketData> {

    public BlockBreakAnimationPacket() {
        super(0x37);
    }

    @Override
    public ByteBuf writePacketData(V1_3BlockBreakAnimationPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getPlayerId());
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getStage());
        return buffer;
    }

    @Override
    public V1_3BlockBreakAnimationPacketData readPacketData(ByteBuf buffer) {
        int playerId = buffer.readInt();
        int x = buffer.readInt();
        int y = buffer.readInt();
        int z = buffer.readInt();
        int stage = buffer.readByte();
        return new V1_3BlockBreakAnimationPacketData(playerId, x, y, z, stage);
    }
}
