package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EncryptionResponsePacket;

import java.util.Arrays;

public class V1_3EncryptionResponsePacketData extends Packet<EncryptionResponsePacket> {
    private byte[] sharedSecret;
    private byte[] token;

    public V1_3EncryptionResponsePacketData(byte[] sharedSecret, byte[] token) {
        this.sharedSecret = sharedSecret;
        this.token = token;
    }

    public byte[] getSharedSecret() {
        return sharedSecret;
    }

    public byte[] getToken() {
        return token;
    }

    @Override
    public Class<EncryptionResponsePacket> getPacketClass() {
        return EncryptionResponsePacket.class;
    }

    @Override
    public String toString() {
        return "V1_3EncryptionResponsePacketData{"
                + "sharedSecret=" + Arrays.toString(sharedSecret)
                + ", token=" + Arrays.toString(token)
                + '}';
    }
}
