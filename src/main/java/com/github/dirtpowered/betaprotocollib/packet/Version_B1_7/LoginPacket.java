package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3LoginPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class LoginPacket extends AbstractPacket<V1_7_3LoginPacketData> {

    public LoginPacket() {
        super(0x01);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3LoginPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getPlayerName(), buffer);
        buffer.writeLong(packet.getSeed());
        buffer.writeByte(packet.getDimension());
        return buffer;
    }

    @Override
    public V1_7_3LoginPacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        String playername = readString(buffer, 16);
        long seed = buffer.readLong();
        int dimension = buffer.readByte();

        return new V1_7_3LoginPacketData(id, playername, seed, dimension);
    }
}
