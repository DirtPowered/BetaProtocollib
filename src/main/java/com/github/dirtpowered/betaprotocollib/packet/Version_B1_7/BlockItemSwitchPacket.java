package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3BlockItemSwitchPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockItemSwitchPacket extends AbstractPacket<V1_7_3BlockItemSwitchPacketData> {

    public BlockItemSwitchPacket() {
        super(0x10);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3BlockItemSwitchPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getSlot());
        return buffer;
    }

    @Override
    public V1_7_3BlockItemSwitchPacketData readPacketData(ByteBuf buffer) {
        int slot = buffer.readShort();
        return new V1_7_3BlockItemSwitchPacketData(slot);
    }
}
