package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.ClientCommandPacket;

public class V1_3ClientCommandPacketData extends Packet<ClientCommandPacket> {
    private int commandId;

    public V1_3ClientCommandPacketData(int commandId) {
        this.commandId = commandId;
    }

    public int getCommandId() {
        return commandId;
    }

    @Override
    public Class<ClientCommandPacket> getPacketClass() {
        return ClientCommandPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3ClientCommandPacketData{"
                + "commandId=" + commandId
                + '}';
    }
}
