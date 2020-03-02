package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.TransactionPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class TransactionPacket extends AbstractPacket<TransactionPacketData> {

    public TransactionPacket() {
        super(0x6A);
    }

    @Override
    public ByteBuf writePacketData(TransactionPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getShortWindowId());
        buffer.writeBoolean(packet.isAccepted());
        return buffer;
    }

    @Override
    public TransactionPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int shortWindowId = buffer.readShort();
        boolean accepted = buffer.readBoolean();
        return new TransactionPacketData(windowId, shortWindowId, accepted);
    }
}
