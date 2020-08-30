package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.PlayNoteblockPacket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class V1_7_3PlayNoteblockPacketData extends Packet<PlayNoteblockPacket> {
    private int x;
    private int y;
    private int z;
    private int instrumentType;
    private int pitch;

    @Override
    public Class<PlayNoteblockPacket> getPacketClass() {
        return PlayNoteblockPacket.class;
    }
}
