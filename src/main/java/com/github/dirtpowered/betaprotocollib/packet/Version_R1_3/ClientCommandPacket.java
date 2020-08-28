package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3ClientCommandPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ClientCommandPacket extends AbstractPacket<V1_3ClientCommandPacketData> {

    public ClientCommandPacket() {
        super(0xCD);
    }

    @Override
    public ByteBuf writePacketData(V1_3ClientCommandPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getCommandId());
        return buffer;
    }

    @Override
    public V1_3ClientCommandPacketData readPacketData(ByteBuf buffer) {
        int commandId = buffer.readByte();
        return new V1_3ClientCommandPacketData(commandId);
    }
}
