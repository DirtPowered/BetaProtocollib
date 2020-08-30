package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.MultiBlockChangePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_2MultiBlockChangePacketData extends Packet<MultiBlockChangePacket> {
    private int chunkX;
    private int chunkZ;
    private int recordCount;
    private int dataSize;
    private byte[] data;

    @Override
    public Class<MultiBlockChangePacket> getPacketClass() {
        return MultiBlockChangePacket.class;
    }
}
