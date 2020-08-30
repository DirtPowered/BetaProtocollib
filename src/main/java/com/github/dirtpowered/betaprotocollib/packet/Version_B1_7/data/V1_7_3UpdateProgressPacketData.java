package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateProgressPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3UpdateProgressPacketData extends Packet<UpdateProgressPacket> {
    private int windowId;
    private int progressBar;
    private int progressBarValue;

    @Override
    public Class<UpdateProgressPacket> getPacketClass() {
        return UpdateProgressPacket.class;
    }
}
