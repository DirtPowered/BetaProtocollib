package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.MapDataPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3MapDataPacketData extends Packet<MapDataPacket> {
    private int mapId;
    private byte[] data;

    @Override
    public Class<MapDataPacket> getPacketClass() {
        return MapDataPacket.class;
    }
}
