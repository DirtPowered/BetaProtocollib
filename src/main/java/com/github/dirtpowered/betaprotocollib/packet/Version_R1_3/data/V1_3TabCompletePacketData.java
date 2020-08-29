package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.TabCompletePacket;

public class V1_3TabCompletePacketData extends Packet<TabCompletePacket> {
    private String text;

    public V1_3TabCompletePacketData(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public Class<TabCompletePacket> getPacketClass() {
        return TabCompletePacket.class;
    }

    @Override
    public String toString() {
        return "V1_3TabCompletePacketData{"
                + "text='" + text + '\''
                + '}';
    }
}
