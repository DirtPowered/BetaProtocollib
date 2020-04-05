package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.MultiBlockChangePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MultiBlockChangePacket extends AbstractPacket<MultiBlockChangePacketData> {

    public MultiBlockChangePacket() {
        super(0x34);
    }

    @Override
    public ByteBuf writePacketData(MultiBlockChangePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getX());
        buffer.writeInt(packet.getZ());
        buffer.writeShort((short) packet.getSize());

        for (int i = 0; i < packet.getSize(); ++i) {
            buffer.writeShort(packet.getCoordinateArray()[i]);
        }

        buffer.writeBytes(packet.getTypeArray());
        buffer.writeBytes(packet.getMetadataArray());
        return buffer;
    }

    @Override
    public MultiBlockChangePacketData readPacketData(ByteBuf buffer) {
        int x = buffer.readInt();
        int z = buffer.readInt();
        int size = buffer.readShort() & '\uffff';
        short[] coordinateArray = new short[size];
        byte[] typeArray = new byte[size];
        byte[] metadataArray = new byte[size];

        for (int i = 0; i < size; ++i) {
            coordinateArray[i] = buffer.readShort();
        }

        buffer.readBytes(typeArray);
        buffer.readBytes(metadataArray);
        return new MultiBlockChangePacketData(x, z, coordinateArray, typeArray, metadataArray, size);
    }
}
