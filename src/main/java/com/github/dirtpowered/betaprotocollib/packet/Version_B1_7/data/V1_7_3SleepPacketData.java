package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.SleepPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3SleepPacketData extends Packet<SleepPacket> {
    private int entityId;
    private boolean wakeup;
    private int x;
    private int y;
    private int z;

    @Override
    public Class<SleepPacket> getPacketClass() {
        return SleepPacket.class;
    }
}
