package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EncryptionRequestPacket;

import java.security.PublicKey;
import java.util.Arrays;

public class V1_3EncryptionRequestPacketData extends Packet<EncryptionRequestPacket> {
    private String serverId;
    private PublicKey publicKey;
    private byte[] token;

    public V1_3EncryptionRequestPacketData(String serverId, PublicKey publicKey, byte[] token) {
        this.serverId = serverId;
        this.publicKey = publicKey;
        this.token = token;
    }

    public String getServerId() {
        return serverId;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public byte[] getToken() {
        return token;
    }

    @Override
    public Class<EncryptionRequestPacket> getPacketClass() {
        return EncryptionRequestPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3EncryptionRequestPacketData{"
                + "serverId='" + serverId + '\''
                + ", publicKey=" + Arrays.toString(publicKey.getEncoded())
                + ", token=" + Arrays.toString(token)
                + '}';
    }
}
