package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.UpdateTileEntityPacket;
import com.mojang.nbt.CompoundTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3UpdateTileEntityPacketData extends Packet<UpdateTileEntityPacket> {
    private int x;
    private int y;
    private int z;
    private int action;
    private CompoundTag nbtData;

    @Override
    public Class<UpdateTileEntityPacket> getPacketClass() {
        return UpdateTileEntityPacket.class;
    }
}
