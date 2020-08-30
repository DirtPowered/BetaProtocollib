package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapChunkPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3MapChunkPacketData extends Packet<MapChunkPacket> {
    private int x;
    private int y;
    private int z;
    private int xSize;
    private int ySize;
    private int zSize;
    private byte[] chunk;

    @Override
    public Class<MapChunkPacket> getPacketClass() {
        return MapChunkPacket.class;
    }
}
