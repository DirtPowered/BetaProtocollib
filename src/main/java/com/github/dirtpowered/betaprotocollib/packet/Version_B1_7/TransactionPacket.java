package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3TransactionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class TransactionPacket extends AbstractPacket<V1_7_3TransactionPacketData> {

    public TransactionPacket() {
        super(0x6A);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3TransactionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getShortWindowId());
        buffer.writeBoolean(packet.isAccepted());
        return buffer;
    }

    @Override
    public V1_7_3TransactionPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int shortWindowId = buffer.readShort();
        boolean accepted = buffer.readBoolean();
        return new V1_7_3TransactionPacketData(windowId, shortWindowId, accepted);
    }
}
