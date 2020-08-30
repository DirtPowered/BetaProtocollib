package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MultiBlockChangePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3MultiBlockChangePacketData extends Packet<MultiBlockChangePacket> {
    private int x;
    private int z;
    private short[] coordinateArray;
    private byte[] typeArray;
    private byte[] metadataArray;
    private int size;

    @Override
    public Class<MultiBlockChangePacket> getPacketClass() {
        return MultiBlockChangePacket.class;
    }
}
