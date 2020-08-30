package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.WindowClickPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3WindowClickPacketData extends Packet<WindowClickPacket> {
    private int windowId;
    private int inventorySlot;
    private int mouseClick;
    private short action;
    private BetaItemStack itemStack;
    private boolean shiftPressed;

    @Override
    public Class<WindowClickPacket> getPacketClass() {
        return WindowClickPacket.class;
    }
}
