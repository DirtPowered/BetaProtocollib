package com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_1.CustomPayloadPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V_1_1CustomPayloadPacketData extends Packet<CustomPayloadPacket> {
    private String channel;
    private int size;
    private byte[] data;

    @Override
    public Class<CustomPayloadPacket> getPacketClass() {
        return CustomPayloadPacket.class;
    }
}
