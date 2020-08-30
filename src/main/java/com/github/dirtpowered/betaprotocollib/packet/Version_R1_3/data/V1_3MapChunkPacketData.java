package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.MapChunkPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3MapChunkPacketData extends Packet<MapChunkPacket> {
    private int chunkX;
    private int chunkZ;
    private boolean groundUp;
    private short primaryBitmap;
    private short additionalBitmap;
    private int compressedDataSize;
    private byte[] data;

    @Override
    public Class<MapChunkPacket> getPacketClass() {
        return MapChunkPacket.class;
    }
}
