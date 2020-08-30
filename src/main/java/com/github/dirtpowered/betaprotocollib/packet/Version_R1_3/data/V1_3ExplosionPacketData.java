package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.ExplosionPacket;
import com.github.dirtpowered.betaprotocollib.utils.BlockLocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3ExplosionPacketData extends Packet<ExplosionPacket> {
    private double x;
    private double y;
    private double z;
    private float explosionSize;
    private List<BlockLocation> destroyedBlockPositions;
    private float pushX;
    private float pushY;
    private float pushZ;

    @Override
    public Class<ExplosionPacket> getPacketClass() {
        return ExplosionPacket.class;
    }
}
