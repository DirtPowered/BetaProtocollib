package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.CloseWindowPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3CloseWindowPacketData extends Packet<CloseWindowPacket> {
    private int windowId;

    @Override
    public Class<CloseWindowPacket> getPacketClass() {
        return CloseWindowPacket.class;
    }
}
