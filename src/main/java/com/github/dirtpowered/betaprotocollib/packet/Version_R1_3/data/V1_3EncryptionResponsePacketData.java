package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EncryptionResponsePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3EncryptionResponsePacketData extends Packet<EncryptionResponsePacket> {
    private byte[] sharedSecret;
    private byte[] token;

    @Override
    public Class<EncryptionResponsePacket> getPacketClass() {
        return EncryptionResponsePacket.class;
    }
}
