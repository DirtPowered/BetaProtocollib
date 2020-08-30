package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.EntityEquipmentPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_3EntityEquipmentPacketData extends Packet<EntityEquipmentPacket> {
    private int entityId;
    private int slot;
    private BetaItemStack itemStack;

    @Override
    public Class<EntityEquipmentPacket> getPacketClass() {
        return EntityEquipmentPacket.class;
    }
}
