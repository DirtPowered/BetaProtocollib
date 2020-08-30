package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.ExplosionPacket;
import com.github.dirtpowered.betaprotocollib.utils.BlockLocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3ExplosionPacketData extends Packet<ExplosionPacket> {
    private double x;
    private double y;
    private double z;
    private float explosionSize;
    private List<BlockLocation> destroyedBlockPositions;

    @Override
    public Class<ExplosionPacket> getPacketClass() {
        return ExplosionPacket.class;
    }
}
