package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3UpdateSignPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateSignPacket extends AbstractPacket<V1_7_3UpdateSignPacketData> {

    public UpdateSignPacket() {
        super(0x82);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3UpdateSignPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());

        for (int line = 0; line < 4; ++line) {
            writeString(packet.getSignLines()[line], buffer);
        }
        return buffer;
    }

    @Override
    public V1_7_3UpdateSignPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readShort();
        int z = buffer.readInt();
        String[] signLines = new String[4];

        for (int line = 0; line < 4; ++line) {
            signLines[line] = readString(buffer, 15);
        }

        return new V1_7_3UpdateSignPacketData(x, y, z, signLines);
    }
}
