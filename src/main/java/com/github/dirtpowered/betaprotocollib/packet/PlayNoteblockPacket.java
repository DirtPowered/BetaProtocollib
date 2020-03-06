package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.PlayNoteblockPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayNoteblockPacket extends AbstractPacket<PlayNoteblockPacketData> {

    public PlayNoteblockPacket() {
        super(0x36);
    }

    @Override
    public ByteBuf writePacketData(PlayNoteblockPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeShort(packet.getY());
        buffer.writeInt(packet.getZ());
        buffer.writeByte(packet.getInstrumentType());
        buffer.writeByte(packet.getPitch());
        return buffer;
    }

    @Override
    public PlayNoteblockPacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int y = buffer.readShort();
        int z = buffer.readInt();
        int instrumentType = buffer.readByte();
        int pitch = buffer.readByte();

        return new PlayNoteblockPacketData(x, y, z, instrumentType, pitch);
    }
}
