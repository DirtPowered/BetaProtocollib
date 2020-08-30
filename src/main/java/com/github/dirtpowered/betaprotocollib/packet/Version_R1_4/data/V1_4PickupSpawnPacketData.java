package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.PickupSpawnPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_4PickupSpawnPacketData extends Packet<PickupSpawnPacket> {
    private int entityId;
    private int x;
    private int y;
    private int z;
    private int yaw;
    private int pitch;
    private int roll;
    private BetaItemStack itemStack;

    @Override
    public Class<PickupSpawnPacket> getPacketClass() {
        return PickupSpawnPacket.class;
    }
}
