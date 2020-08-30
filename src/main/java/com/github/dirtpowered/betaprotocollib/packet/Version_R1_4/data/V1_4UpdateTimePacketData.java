package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.UpdateTimePacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_4UpdateTimePacketData extends Packet<UpdateTimePacket> {
    private long age;
    private long time;

    @Override
    public Class<UpdateTimePacket> getPacketClass() {
        return UpdateTimePacket.class;
    }
}
