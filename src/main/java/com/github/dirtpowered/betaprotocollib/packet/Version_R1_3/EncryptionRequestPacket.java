package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3EncryptionRequestPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class EncryptionRequestPacket extends AbstractPacket<V1_3EncryptionRequestPacketData> {

    public EncryptionRequestPacket() {
        super(0xFD);
    }

    @Override
    public ByteBuf writePacketData(V1_3EncryptionRequestPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getServerId(), buffer);

        writeByteArray(buffer, packet.getPublicKey().getEncoded());
        writeByteArray(buffer, packet.getToken());
        return buffer;
    }

    @Override
    public V1_3EncryptionRequestPacketData readPacketData(ByteBuf buffer) throws IOException {
        String serverId = readString(buffer, 20);
        byte[] keyData = readByteArray(buffer);

        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyData);

        PublicKey publicKey = null;

        try {
            KeyFactory keyFactory;

            keyFactory = KeyFactory.getInstance("RSA");
            publicKey = keyFactory.generatePublic(spec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }

        byte[] tokenData = readByteArray(buffer);
        return new V1_3EncryptionRequestPacketData(serverId, publicKey, tokenData);
    }
}
