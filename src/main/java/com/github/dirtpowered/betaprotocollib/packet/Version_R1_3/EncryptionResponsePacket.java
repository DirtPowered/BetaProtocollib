package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3EncryptionResponsePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;

public class EncryptionResponsePacket extends AbstractPacket<V1_3EncryptionResponsePacketData> {

    public EncryptionResponsePacket() {
        super(0xFC);
    }

    @Override
    public ByteBuf writePacketData(V1_3EncryptionResponsePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeByteArray(buffer, packet.getSharedSecret());
        writeByteArray(buffer, packet.getToken());
        return buffer;
    }

    @Override
    public V1_3EncryptionResponsePacketData readPacketData(ByteBuf buffer) throws IOException {
        byte[] sharedSecret = readByteArray(buffer);
        byte[] token = readByteArray(buffer);
        return new V1_3EncryptionResponsePacketData(sharedSecret, token);
    }
}
