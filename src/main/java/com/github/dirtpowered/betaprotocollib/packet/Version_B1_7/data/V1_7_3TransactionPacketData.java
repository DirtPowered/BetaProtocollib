package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.TransactionPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3TransactionPacketData extends Packet<TransactionPacket> {
    private int windowId;
    private int shortWindowId;
    private boolean accepted;

    @Override
    public Class<TransactionPacket> getPacketClass() {
        return TransactionPacket.class;
    }
}
