package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.BedAndWeatherPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1BedAndWeatherPacketData extends Packet<BedAndWeatherPacket> {
    private int reason;
    private int gameMode;

    @Override
    public Class<BedAndWeatherPacket> getPacketClass() {
        return BedAndWeatherPacket.class;
    }
}
