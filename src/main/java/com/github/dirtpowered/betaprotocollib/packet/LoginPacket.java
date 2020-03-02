package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.LoginPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class LoginPacket extends AbstractPacket<LoginPacketData> {

    public LoginPacket() {
        super(0x01);
    }

    @Override
    public ByteBuf writePacketData(LoginPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        writeString(packet.getPlayerName(), buffer);
        buffer.writeLong(packet.getSeed());
        buffer.writeByte(packet.getDimension());
        return buffer;
    }

    @Override
    public LoginPacketData readPacketData(ByteBuf buffer) {
        int id = buffer.readInt();
        String playername = readString(buffer, 16);
        long seed = buffer.readLong();
        int dimension = buffer.readByte();
        return new LoginPacketData(id, playername, seed, dimension);
    }
}
