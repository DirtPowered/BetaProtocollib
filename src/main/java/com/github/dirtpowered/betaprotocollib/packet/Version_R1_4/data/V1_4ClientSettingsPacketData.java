package com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_4.ClientSettingsPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_4ClientSettingsPacketData extends Packet<ClientSettingsPacket> {
    private String locale;
    private int viewDistance;
    private int chatFlags;
    private int difficulty;
    private boolean colorsEnabled;
    private boolean showCape;

    @Override
    public Class<ClientSettingsPacket> getPacketClass() {
        return ClientSettingsPacket.class;
    }
}
