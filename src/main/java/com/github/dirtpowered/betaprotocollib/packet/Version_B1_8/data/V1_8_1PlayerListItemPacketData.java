package com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.PlayerListItemPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_8_1PlayerListItemPacketData extends Packet<PlayerListItemPacket> {
    private String username;
    private boolean online;
    private short ping;

    @Override
    public Class<PlayerListItemPacket> getPacketClass() {
        return PlayerListItemPacket.class;
    }
}
