package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.OpenWindowPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3OpenWindowPacketData extends Packet<OpenWindowPacket> {
    private int windowId;
    private int inventoryType;
    private String windowTitle;
    private int slotsCount;

    @Override
    public Class<OpenWindowPacket> getPacketClass() {
        return OpenWindowPacket.class;
    }
}
