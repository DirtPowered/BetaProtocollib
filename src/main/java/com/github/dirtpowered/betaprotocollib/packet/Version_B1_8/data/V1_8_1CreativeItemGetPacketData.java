package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.CreativeItemGetPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1CreativeItemGetPacketData extends Packet<CreativeItemGetPacket> {
    private short slotId;
    private BetaItemStack itemStack;

    @Override
    public Class<CreativeItemGetPacket> getPacketClass() {
        return CreativeItemGetPacket.class;
    }
}
