package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EncryptionRequestPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.security.PublicKey;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3EncryptionRequestPacketData extends Packet<EncryptionRequestPacket> {
    private String serverId;
    private PublicKey publicKey;
    private byte[] token;

    @Override
    public Class<EncryptionRequestPacket> getPacketClass() {
        return EncryptionRequestPacket.class;
    }
}
