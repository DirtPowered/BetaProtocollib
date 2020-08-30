package com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_2.UpdateTileEntityPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_2UpdateTileEntityPacketData extends Packet<UpdateTileEntityPacket> {
    private int x;
    private int y;
    private int z;
    private int action;
    private int mobType;
    private int customData;
    private int customData2;

    @Override
    public Class<UpdateTileEntityPacket> getPacketClass() {
        return UpdateTileEntityPacket.class;
    }
}
