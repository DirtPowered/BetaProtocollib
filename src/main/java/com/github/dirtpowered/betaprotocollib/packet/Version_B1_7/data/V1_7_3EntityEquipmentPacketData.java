package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.EntityEquipmentPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3EntityEquipmentPacketData extends Packet<EntityEquipmentPacket> {
    private int entityId;
    private int slot;
    private int itemId;
    private int itemData;

    @Override
    public Class<EntityEquipmentPacket> getPacketClass() {
        return EntityEquipmentPacket.class;
    }
}
